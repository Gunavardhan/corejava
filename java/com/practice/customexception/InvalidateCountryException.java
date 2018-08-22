package com.practice.customexception;

public class InvalidateCountryException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3357758110150306398L;

	public InvalidateCountryException(String message) {
		super(message);
	}
}
