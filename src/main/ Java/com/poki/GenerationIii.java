package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIii{

	@JsonProperty("ruby-sapphire")
	private RubySapphire rubySapphire;

	@JsonProperty("firered-leafgreen")
	private FireredLeafgreen fireredLeafgreen;

	@JsonProperty("icons")
	private Icons icons;

	@JsonProperty("emerald")
	private Emerald emerald;

	public void setRubySapphire(RubySapphire rubySapphire){
		this.rubySapphire = rubySapphire;
	}

	public RubySapphire getRubySapphire(){
		return rubySapphire;
	}

	public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen){
		this.fireredLeafgreen = fireredLeafgreen;
	}

	public FireredLeafgreen getFireredLeafgreen(){
		return fireredLeafgreen;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	public void setEmerald(Emerald emerald){
		this.emerald = emerald;
	}

	public Emerald getEmerald(){
		return emerald;
	}

	@Override
 	public String toString(){
		return 
			"GenerationIii{" + 
			"ruby-sapphire = '" + rubySapphire + '\'' + 
			",firered-leafgreen = '" + fireredLeafgreen + '\'' + 
			",icons = '" + icons + '\'' + 
			",emerald = '" + emerald + '\'' + 
			"}";
		}
}