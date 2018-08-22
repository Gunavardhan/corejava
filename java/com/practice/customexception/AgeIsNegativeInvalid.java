package com.practice.customexception;

public class AgeIsNegativeInvalid extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String message;
	public AgeIsNegativeInvalid(String message){
		this.message = message;
	}
	@Override
	public String toString() {
		return message;
	}
}
