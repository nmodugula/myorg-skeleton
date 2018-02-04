package com.myorg.ecomm.sample.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DataNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String string) {
		super(string);
	}

}
