package com.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UserSerAndDeserTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		UserSerAndDeser serDeser = new UserSerAndDeser();
		serDeser.setUserId(123);
		serDeser.setUserName("Dhoni");
		serDeser.setEmail("dhoni@gmail.com");
		serDeser.setMobile("994902641");
		serDeser.setUpwd("dhoni123");

		// serialize
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Java-Practice\\CoreJavaPractice\\serdeser\\user.text");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(serDeser);
			oos.close();
			fos.close();
			System.out.println("Save in file USer obj");
		} catch (Exception e) {
			e.printStackTrace();
		}
		serDeser = null;
		//System.out.println(serDeser.getEmail());//NPE
		//deserialize
		
		try{
			FileInputStream fis = new FileInputStream("D:\\Java-Practice\\CoreJavaPractice\\serdeser\\user.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			serDeser =(UserSerAndDeser) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("DESRIALIZATION OBJECT FROM file : " + serDeser);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("********From File - Deserialization *******");
		System.out.println("Useranem : " + serDeser.getUserName() + "\n" + "Mobile : " + serDeser.getMobile());
	}
}
