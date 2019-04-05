package com.capgemini.appl.exception;

public class UniversityAdmissionException extends Exception {

	private static final long serialVersionUID = 1L;
	public UniversityAdmissionException() {
		// TODO Auto-generated constructor stub
	}

	public UniversityAdmissionException(String message) {
		super(message);
		}

	public UniversityAdmissionException(Throwable cause) {
		super(cause);
	}

	public UniversityAdmissionException(String message, Throwable cause) {
		super(message, cause);
	}

	public UniversityAdmissionException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
