package com.bridgeit.exception;

public class InSufficientFundException extends Throwable 
{
	private static final long serialVersionUID = 1L;
	private String message;
	public InSufficientFundException(String message) 
	{
        this.message = message;
    }
}
