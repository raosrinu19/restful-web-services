/**
 * 
 */
package com.autopi.restful.webservices.restfulwebservices.helloworld;

/**
 * @author srambha
 *
 */
public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]", message);
	}

	
	
}
