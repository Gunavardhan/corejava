package com.practice.customexception;

import java.util.ArrayList;
import java.util.List;

public class ContryCheckMain {

	public static void main(String[] args) throws InvalidateCountryException {
		List<Country> counries = new ArrayList<>();
		counries.add(new Country("India"));
		counries.add(new Country("England"));
		//counries.add(new Country("Sri Lanka"));
		System.out.println(counries);
		boolean checkListOfCountries = checkListOfCountries(counries);
		System.out.println(checkListOfCountries);
		try{
		if(checkListOfCountries){
			System.out.println("WE DON'T HAVE USA IN THE LIST");
			counries.add(new Country("USA"));
			Country c = new Country();
			c.setCountryName("USA");
			if(c.getCountryName().equals("USA")){
				counries.add(c);
				//System.out.println(counries);
				checkListOfCountries(counries);
			}
		}
		}catch(InvalidateCountryException e){
			e.printStackTrace();
		}
	}
	
	public static boolean checkListOfCountries(List<Country> countries) throws InvalidateCountryException{
		for (int i = 0; i < countries.size(); i++) {
			Country country = countries.get(i);
			if(country.getCountryName().equals("USA")){
				throw new InvalidateCountryException("*****USA IS NOT ALLOWED*****");
			}
		}
		return true;
	}
}
