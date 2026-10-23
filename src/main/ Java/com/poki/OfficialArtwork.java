package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OfficialArtwork{

	@JsonProperty("versions")
	private Versions versions;

	@JsonProperty("front_default")
	private String frontDefault;

	@JsonProperty("front_shiny")
	private String frontShiny;

	public void setVersions(Versions versions){
		this.versions = versions;
	}

	public Versions getVersions(){
		return versions;
	}

	public void setFrontDefault(String frontDefault){
		this.frontDefault = frontDefault;
	}

	public String getFrontDefault(){
		return frontDefault;
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
			"OfficialArtwork{" + 
			"versions = '" + versions + '\'' + 
			",front_default = '" + frontDefault + '\'' + 
			",front_shiny = '" + frontShiny + '\'' + 
			"}";
		}
}