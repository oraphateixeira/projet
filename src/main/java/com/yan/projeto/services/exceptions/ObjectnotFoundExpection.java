package com.yan.projeto.services.exceptions;

public class ObjectnotFoundExpection extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObjectnotFoundExpection(Object id) {
		super("Resource not found. Id " + id);
	}
}
