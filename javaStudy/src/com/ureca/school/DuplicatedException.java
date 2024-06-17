package com.ureca.school;

public class DuplicatedException extends Exception {

	public DuplicatedException() {
		this("DuplicatedException Exception");
	}

	public DuplicatedException(String message) {
		super(message);
	}

}
