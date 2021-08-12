package com.af.exceptions;

@SuppressWarnings("serial")
public class InvalidFilePathException extends FrameworkException{

	public InvalidFilePathException(String message) {
		super(message);
	}
	public InvalidFilePathException(String message,Throwable cause) {
		super(message,cause);
	}

}
