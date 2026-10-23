package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Icons{

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_female")
	private Object frontFemale;

	@JsonProperty("front_shiny_female")
	private Object frontShinyFemale;

	@JsonProperty("front_shiny")
	private String frontShiny;

	@JsonProperty("animated")
	private Animated animated;

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

	public void setFrontShinyFemale(Object frontShinyFemale){
		this.frontShinyFemale = frontShinyFemale;
	}

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

	public void setFrontShiny(String frontShiny){
		this.frontShiny = frontShiny;
	}

	public String getFrontShiny(){
		return frontShiny;
	}

	public void setAnimated(Animated animated){
		this.animated = animated;
	}

	public Animated getAnimated(){
		return animated;
	}

	@Override
 	public String toString(){
		return 
			"Icons{" + 
			"front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			",front_shiny_female = '" + frontShinyFemale + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			",animated = '" + animated + '\'' + 
			"}";
		}
}