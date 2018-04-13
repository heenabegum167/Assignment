package com.vending.machine.exception;

public class NotSufficientChangeException extends RuntimeException { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message; 
	public NotSufficientChangeException(String string) {
		this.message = string; 
	}
	@Override 
	public String getMessage(){
		return message; 
		}
	}
