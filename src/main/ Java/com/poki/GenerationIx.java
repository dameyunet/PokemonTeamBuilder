package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIx{

	@JsonProperty("champions")
	private Champions champions;

	@JsonProperty("scarlet-violet")
	private ScarletViolet scarletViolet;

	@JsonProperty("legends-za")
	private LegendsZa legendsZa;

	public void setChampions(Champions champions){
		this.champions = champions;
	}

	public Champions getChampions(){
		return champions;
	}

	public void setScarletViolet(ScarletViolet scarletViolet){
		this.scarletViolet = scarletViolet;
	}

	public ScarletViolet getScarletViolet(){
		return scarletViolet;
	}

	public void setLegendsZa(LegendsZa legendsZa){
		this.legendsZa = legendsZa;
	}

	public LegendsZa getLegendsZa(){
		return legendsZa;
	}

	@Override
 	public String toString(){
		return 
			"GenerationIx{" + 
			"champions = '" + champions + '\'' + 
			",scarlet-violet = '" + scarletViolet + '\'' + 
			",legends-za = '" + legendsZa + '\'' + 
			"}";
		}
}