package com.af.exceptions;

@SuppressWarnings("serial")
public class ExcelReadWriteException extends FrameworkException {

	public ExcelReadWriteException(String message) {
		super(message);
	}
	public ExcelReadWriteException(String message,Throwable cause) {
		super(message,cause);
	}
}
