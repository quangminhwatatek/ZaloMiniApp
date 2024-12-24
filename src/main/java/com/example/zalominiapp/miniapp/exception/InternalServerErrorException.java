package com.example.zalominiapp.miniapp.exception;

import jakarta.servlet.http.HttpServletResponse;

public class InternalServerErrorException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5424239014062553613L;
	private final int statusCode;

    public InternalServerErrorException(String message) {
        super(message);
        this.statusCode = HttpServletResponse.SC_BAD_REQUEST;
    }

    public InternalServerErrorException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
