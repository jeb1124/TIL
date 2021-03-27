package com.encore.exception;

public class DuplicateISBNException extends Exception{
	public DuplicateISBNException() {
		this("ISBN이 중복되었습니다.");
	}
	public DuplicateISBNException(String message) {
		super(message);
	}
}
