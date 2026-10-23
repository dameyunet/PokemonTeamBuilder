package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FireredLeafgreen{

	@JsonProperty("back_default")
	private String backDefault;

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("back_shiny")
	private String backShiny;

	@JsonProperty("front_shiny")
	private String frontShiny;

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

	public void setBackShiny(String backShiny){
		this.backShiny = backShiny;
	}

	public String getBackShiny(){
		return backShiny;
	}

	public void setFrontShiny(String frontShiny){
		this.frontShiny = frontShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"FireredLeafgreen{" + 
			"back_default = '" + backDefault + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}