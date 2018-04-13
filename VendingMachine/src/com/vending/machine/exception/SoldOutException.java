package com.vending.machine.exception;

public class SoldOutException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message; public SoldOutException(String string) {
		this.message = string; 
		}
	@Override public String getMessage(){ 
		return message; 
	}
}
