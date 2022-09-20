package com.backend.project.exceptions;

import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class ResourceNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String resourceName;
	String fieldsName;
	long fieldsValue;

	public ResourceNotFoundException(String resourceName, String fieldsName, long fieldsValue) {
		super(String.format("%s not found with %s:%s", resourceName, fieldsName, fieldsValue));
		this.resourceName = resourceName;
		this.fieldsName = fieldsName;
		this.fieldsValue = fieldsValue;
	}

}
