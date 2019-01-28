package com.dhiraj.datetest;

public enum Status {

	SUCCESS(200, "Success."),

	EMAIL_ALREADY_EXIST(201, "Email address already exist."),

	BAD_REQUEST(400, "Bad request."),

	NOT_FOUND(404, "Not found."),

	SERVER_ERROR(500, "Server Error.");
	
	private final int value;

	private final String message;

	Status(int value, String messege) {
		this.value = value;
		message = messege;
	}

	public int value() {
		return value;
	}

	public String message() {
		return message;
	}

	@Override
	public String toString() {
		return Integer.toString(value);
	}
}
