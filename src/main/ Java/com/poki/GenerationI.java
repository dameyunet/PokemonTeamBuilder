package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationI{

	@JsonProperty("yellow")
	private Yellow yellow;

	@JsonProperty("red-green-japan")
	private RedGreenJapan redGreenJapan;

	@JsonProperty("red-blue")
	private RedBlue redBlue;

	@JsonProperty("red-and-blue")
	private RedAndBlue redAndBlue;

	@JsonProperty("red-and-green")
	private RedAndGreen redAndGreen;

	public void setYellow(Yellow yellow){
		this.yellow = yellow;
	}

	public Yellow getYellow(){
		return yellow;
	}

	public void setRedGreenJapan(RedGreenJapan redGreenJapan){
		this.redGreenJapan = redGreenJapan;
	}

	public RedGreenJapan getRedGreenJapan(){
		return redGreenJapan;
	}

	public void setRedBlue(RedBlue redBlue){
		this.redBlue = redBlue;
	}

	public RedBlue getRedBlue(){
		return redBlue;
	}

	public void setRedAndBlue(RedAndBlue redAndBlue){
		this.redAndBlue = redAndBlue;
	}

	public RedAndBlue getRedAndBlue(){
		return redAndBlue;
	}

	public void setRedAndGreen(RedAndGreen redAndGreen){
		this.redAndGreen = redAndGreen;
	}

	public RedAndGreen getRedAndGreen(){
		return redAndGreen;
	}

	@Override
 	public String toString(){
		return 
			"GenerationI{" + 
			"yellow = '" + yellow + '\'' + 
			",red-green-japan = '" + redGreenJapan + '\'' + 
			",red-blue = '" + redBlue + '\'' + 
			",red-and-blue = '" + redAndBlue + '\'' + 
			",red-and-green = '" + redAndGreen + '\'' + 
			"}";
		}
}