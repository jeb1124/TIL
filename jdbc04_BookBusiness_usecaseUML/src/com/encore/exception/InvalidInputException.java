package com.encore.exception;

public class InvalidInputException extends Exception{
	public InvalidInputException() {
		this("MAX값이 MIN값보다 커야합니다.");
	}
	public InvalidInputException(String message) {
		super(message);
	}
}
