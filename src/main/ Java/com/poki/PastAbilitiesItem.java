package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PastAbilitiesItem{

	@JsonProperty("generation")
	private Generation generation;

	@JsonProperty("abilities")
	private List<AbilitiesItem> abilities;

	public void setGeneration(Generation generation){
		this.generation = generation;
	}

	public Generation getGeneration(){
		return generation;
	}

	public void setAbilities(List<AbilitiesItem> abilities){
		this.abilities = abilities;
	}

	public List<AbilitiesItem> getAbilities(){
		return abilities;
	}

	@Override
 	public String toString(){
		return 
			"PastAbilitiesItem{" + 
			"generation = '" + generation + '\'' + 
			",abilities = '" + abilities + '\'' + 
			"}";
		}
}