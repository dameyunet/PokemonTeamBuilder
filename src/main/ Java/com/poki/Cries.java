package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cries{

	@JsonProperty("legacy")
	private String legacy;

	@JsonProperty("latest")
	private String latest;

	public void setLegacy(String legacy){
		this.legacy = legacy;
	}

	public String getLegacy(){
		return legacy;
	}

	public void setLatest(String latest){
		this.latest = latest;
	}

	public String getLatest(){
		return latest;
	}

	@Override
 	public String toString(){
		return 
			"Cries{" + 
			"legacy = '" + legacy + '\'' + 
			",latest = '" + latest + '\'' + 
			"}";
		}
}