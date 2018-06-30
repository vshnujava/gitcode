package com.inventory.restfulbasic;

public class VehicleNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VehicleNotFoundException(String exception) {
		super(exception);
	}

}
