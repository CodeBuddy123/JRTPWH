package com.ashsoft.consts;

public enum POStatus {
	
	OPEN("OPEN"), PICKING("PICKING"), 
	ORDERED("ORDERED") ,INVOICED("INVOICED");
	
	private String value;

	private POStatus(String value) {
		this.value = value;
	}
	
	public String getValue()
	{
		return value;
	}
}
