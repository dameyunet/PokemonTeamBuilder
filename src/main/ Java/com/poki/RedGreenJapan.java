package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedGreenJapan{

	@JsonProperty("front_gray")
	private String frontGray;

	@JsonProperty("back_gray")
	private String backGray;

	@JsonProperty("back_default")
	private String backDefault;

	@JsonProperty("front_default")
	private String frontDefault;

	public void setFrontGray(String frontGray){
		this.frontGray = frontGray;
	}

	public String getFrontGray(){
		return frontGray;
	}

	public void setBackGray(String backGray){
		this.backGray = backGray;
	}

	public String getBackGray(){
		return backGray;
	}

	public void setBackDefault(String backDefault){
		this.backDefault = backDefault;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
	}

	@Override
 	public String toString(){
		return 
			"RedGreenJapan{" + 
			"front_gray = '" + frontGray + '\'' + 
			",back_gray = '" + backGray + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			"}";
		}
}