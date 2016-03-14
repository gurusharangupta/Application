package com.got.exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5376158782001097902L;
	
	
	public DataNotFoundException(String message){
		
		super(message);
	}
	
	public DataNotFoundException(Throwable e){
		
		super(e);
	}
	
public DataNotFoundException(String message,Throwable e){
		
		super(message,e);
	}

}
