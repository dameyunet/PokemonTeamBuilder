package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVii{

	@JsonProperty("lets-go-pikachu-lets-go-eevee")
	private LetsGoPikachuLetsGoEevee letsGoPikachuLetsGoEevee;

	@JsonProperty("icons")
	private Icons icons;

	@JsonProperty("ultra-sun-ultra-moon")
	private UltraSunUltraMoon ultraSunUltraMoon;

	public void setLetsGoPikachuLetsGoEevee(LetsGoPikachuLetsGoEevee letsGoPikachuLetsGoEevee){
		this.letsGoPikachuLetsGoEevee = letsGoPikachuLetsGoEevee;
	}

	public LetsGoPikachuLetsGoEevee getLetsGoPikachuLetsGoEevee(){
		return letsGoPikachuLetsGoEevee;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	public void setUltraSunUltraMoon(UltraSunUltraMoon ultraSunUltraMoon){
		this.ultraSunUltraMoon = ultraSunUltraMoon;
	}

	public UltraSunUltraMoon getUltraSunUltraMoon(){
		return ultraSunUltraMoon;
	}

	@Override
 	public String toString(){
		return 
			"GenerationVii{" + 
			"lets-go-pikachu-lets-go-eevee = '" + letsGoPikachuLetsGoEevee + '\'' + 
			",icons = '" + icons + '\'' + 
			",ultra-sun-ultra-moon = '" + ultraSunUltraMoon + '\'' + 
			"}";
		}
}