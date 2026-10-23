package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedAndBlue{

	@JsonProperty("front_default")
	private String frontDefault;

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	@Override
 	public String toString(){
		return 
			"RedAndBlue{" + 
			"front_default = '" + frontDefault + '\'' + 
			"}";
		}
}