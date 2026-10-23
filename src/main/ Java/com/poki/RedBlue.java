package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedBlue{

	@JsonProperty("front_gray")
	private String frontGray;

	@JsonProperty("back_transparent")
	private String backTransparent;

	@JsonProperty("back_gray")
	private String backGray;

	@JsonProperty("back_default")
	private String backDefault;

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_transparent")
	private String frontTransparent;

	@JsonProperty("back_transparent_gray")
	private String backTransparentGray;

	@JsonProperty("front_transparent_gray")
	private String frontTransparentGray;

	public void setFrontGray(String frontGray){
		this.frontGray = frontGray;
	}

	public String getFrontGray(){
		return frontGray;
	}

	public void setBackTransparent(String backTransparent){
		this.backTransparent = backTransparent;
	}

	public String getBackTransparent(){
		return backTransparent;
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

	public void setFrontTransparent(String frontTransparent){
		this.frontTransparent = frontTransparent;
	}

	public String getFrontTransparent(){
		return frontTransparent;
	}

	public void setBackTransparentGray(String backTransparentGray){
		this.backTransparentGray = backTransparentGray;
	}

	public String getBackTransparentGray(){
		return backTransparentGray;
	}

	public void setFrontTransparentGray(String frontTransparentGray){
		this.frontTransparentGray = frontTransparentGray;
	}

	public String getFrontTransparentGray(){
		return frontTransparentGray;
	}

	@Override
 	public String toString(){
		return 
			"RedBlue{" + 
			"front_gray = '" + frontGray + '\'' + 
			",back_transparent = '" + backTransparent + '\'' + 
			",back_gray = '" + backGray + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_transparent = '" + frontTransparent + '\'' + 
			",back_transparent_gray = '" + backTransparentGray + '\'' + 
			",front_transparent_gray = '" + frontTransparentGray + '\'' + 
			"}";
		}
}