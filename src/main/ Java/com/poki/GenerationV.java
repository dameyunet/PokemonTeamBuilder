package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationV{

	@JsonProperty("black-white")
	private BlackWhite blackWhite;

	@JsonProperty("icons")
	private Icons icons;

	public void setBlackWhite(BlackWhite blackWhite){
		this.blackWhite = blackWhite;
	}

	public BlackWhite getBlackWhite(){
		return blackWhite;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	@Override
 	public String toString(){
		return 
			"GenerationV{" + 
			"black-white = '" + blackWhite + '\'' + 
			",icons = '" + icons + '\'' + 
			"}";
		}
}