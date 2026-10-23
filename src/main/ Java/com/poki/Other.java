package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Other{

	@JsonProperty("dream_world")
	private DreamWorld dreamWorld;

	@JsonProperty("showdown")
	private Showdown showdown;

	@JsonProperty("official-artwork")
	private OfficialArtwork officialArtwork;

	@JsonProperty("home")
	private Home home;

	public void setDreamWorld(DreamWorld dreamWorld){
		this.dreamWorld = dreamWorld;
	}

	public DreamWorld getDreamWorld(){
		return dreamWorld;
	}

	public void setShowdown(Showdown showdown){
		this.showdown = showdown;
	}

	public Showdown getShowdown(){
		return showdown;
	}

	public void setOfficialArtwork(OfficialArtwork officialArtwork){
		this.officialArtwork = officialArtwork;
	}

	public OfficialArtwork getOfficialArtwork(){
		return officialArtwork;
	}

	public void setHome(Home home){
		this.home = home;
	}

	public Home getHome(){
		return home;
	}

	@Override
 	public String toString(){
		return 
			"Other{" + 
			"dream_world = '" + dreamWorld + '\'' + 
			",showdown = '" + showdown + '\'' + 
			",official-artwork = '" + officialArtwork + '\'' + 
			",home = '" + home + '\'' + 
			"}";
		}
}