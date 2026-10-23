package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Animated{

	@JsonProperty("front_shiny_female")
	private Object frontShinyFemale;

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_female")
	private Object frontFemale;

	@JsonProperty("front_shiny")
	private String frontShiny;

	@JsonProperty("back_shiny_female")
	private Object backShinyFemale;

	@JsonProperty("back_female")
	private Object backFemale;

	@JsonProperty("back_default")
	private String backDefault;

	@JsonProperty("back_shiny")
	private String backShiny;

	public void setFrontShinyFemale(Object frontShinyFemale){
		this.frontShinyFemale = frontShinyFemale;
	}

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

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

	public void setFrontShiny(String frontShiny){
		this.frontShiny = frontShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	public void setBackShinyFemale(Object backShinyFemale){
		this.backShinyFemale = backShinyFemale;
	}

	public Object getBackShinyFemale(){
		return backShinyFemale;
	}

	public void setBackFemale(Object backFemale){
		this.backFemale = backFemale;
	}

	public Object getBackFemale(){
		return backFemale;
	}

	public void setBackDefault(String backDefault){
		this.backDefault = backDefault;
	}

	public String getBackDefault(){
		return backDefault;
	}

	public void setBackShiny(String backShiny){
		this.backShiny = backShiny;
	}

	public String getBackShiny(){
		return backShiny;
	}

	@Override
 	public String toString(){
		return 
			"Animated{" + 
			"front_shiny_female = '" + frontShinyFemale + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			",back_shiny_female = '" + backShinyFemale + '\'' + 
			",back_female = '" + backFemale + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			"}";
		}
}