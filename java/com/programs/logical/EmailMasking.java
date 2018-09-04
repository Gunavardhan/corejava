package com.programs.logical;

import java.util.Arrays;

public class EmailMasking {

	public static void main(String[] args) throws Exception {
		String maskEmailAddress = maskEmailAddress("ramu@gmail.com", '*');
		System.out.println(maskEmailAddress);
	}
	
	public static String maskEmailAddress(String email, char maskChar) throws Exception{
		String[] partsStr = email.split("@");
		System.out.println(Arrays.toString(partsStr));
		String strId = "";
		if(partsStr[0].length() < 3){
			strId = maskString(partsStr[0], 0, partsStr[0].length(), '*');
		}else{
			strId = maskString(partsStr[0], 1, partsStr[0].length()-1, '*');
		}	
		return strId + "@" + partsStr[1];
	}
	
	public static String maskString(String strText, int start ,int end, char maskChar) throws Exception{
		if(strText == null || strText.equals(""))
            return "";
        
        if(start < 0)
            start = 0;
        
        if( end > strText.length() )
            end = strText.length();
            
        if(start > end)
            throw new Exception("End index cannot be greater than start index");
        
        int maskLength = end - start;
        System.out.println(maskLength);
        if(maskLength == 0)
            return strText;
        
        StringBuilder sbMaskString = new StringBuilder(maskLength);
        
        for(int i = 0; i < maskLength; i++){
            sbMaskString.append(maskChar);
        }
        
        return strText.substring(0, start) 
                + sbMaskString.toString() 
                + strText.substring(start + maskLength);
		
	}
}
