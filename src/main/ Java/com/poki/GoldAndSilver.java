package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GoldAndSilver{

	@JsonProperty("front_default")
	private Object frontDefault;

	public void setFrontDefault(Object frontDefault){
		this.frontDefault = frontDefault;
	}

	public Object getFrontDefault(){
		return frontDefault;
	}

	@Override
 	public String toString(){
		return 
			"GoldAndSilver{" + 
			"front_default = '" + frontDefault + '\'' + 
			"}";
		}
}