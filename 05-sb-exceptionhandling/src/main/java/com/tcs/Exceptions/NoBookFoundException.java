package com.tcs.Exceptions;

public class NoBookFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5245739192185355480L;

	public NoBookFoundException(String msg) {
		super(msg);
	}

}
