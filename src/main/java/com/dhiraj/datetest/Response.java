package com.dhiraj.datetest;

public class Response {

	private String statusCode;
	private String message;

	public Response(Status status) {
		statusCode = status.toString();
		message = status.message();
	}

	public Response(String statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getMessage() {
		return message;
	}
}