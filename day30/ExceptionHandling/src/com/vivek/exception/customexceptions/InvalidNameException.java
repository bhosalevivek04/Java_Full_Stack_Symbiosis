package com.vivek.exception.customexceptions;

public class InvalidNameException extends Exception {
//	public InvalidNameException() {
//		super();
//	}
//
//	public InvalidNameException(String message, Throwable cause, boolean enableSuppression,
//			boolean writableStackTrace) {
//		super(message, cause, enableSuppression, writableStackTrace);
//		// TODO Auto-generated constructor stub
//	}

	public InvalidNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidNameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidNameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
