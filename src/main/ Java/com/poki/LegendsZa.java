package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LegendsZa{

	@JsonProperty("back_shiny_female")
	private Object backShinyFemale;

	@JsonProperty("back_female")
	private Object backFemale;

	@JsonProperty("back_default")
	private Object backDefault;

	@JsonProperty("front_shiny_female")
	private Object frontShinyFemale;

	@JsonProperty("front_default")
	private Object frontDefault;

	@JsonProperty("front_female")
	private Object frontFemale;

	@JsonProperty("back_shiny")
	private Object backShiny;

	@JsonProperty("icons")
	private Icons icons;

	@JsonProperty("front_shiny")
	private Object frontShiny;

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

	public void setBackDefault(Object backDefault){
		this.backDefault = backDefault;
	}

	public Object getBackDefault(){
		return backDefault;
	}

	public void setFrontShinyFemale(Object frontShinyFemale){
		this.frontShinyFemale = frontShinyFemale;
	}

	public Object getFrontShinyFemale(){
		return frontShinyFemale;
	}

	public void setFrontDefault(Object frontDefault){
		this.frontDefault = frontDefault;
	}

	public Object getFrontDefault(){
		return frontDefault;
	}

	public void setFrontFemale(Object frontFemale){
		this.frontFemale = frontFemale;
	}

	public Object getFrontFemale(){
		return frontFemale;
	}

	public void setBackShiny(Object backShiny){
		this.backShiny = backShiny;
	}

	public Object getBackShiny(){
		return backShiny;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	public void setFrontShiny(Object frontShiny){
		this.frontShiny = frontShiny;
	}

	public Object getFrontShiny(){
		return frontShiny;
	}

	@Override
 	public String toString(){
		return 
			"LegendsZa{" + 
			"back_shiny_female = '" + backShinyFemale + '\'' + 
			",back_female = '" + backFemale + '\'' + 
			",back_default = '" + backDefault + '\'' + 
			",front_shiny_female = '" + frontShinyFemale + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_female = '" + frontFemale + '\'' + 
			",back_shiny = '" + backShiny + '\'' + 
			",icons = '" + icons + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}