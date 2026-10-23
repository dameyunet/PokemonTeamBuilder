package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DreamWorld{

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_female")
	private Object frontFemale;

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	public void setFrontFemale(Object frontFemale){
		this.frontFemale = frontFemale;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	@Override
 	public String toString(){
		return 
			"DreamWorld{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			"}";
		}
}