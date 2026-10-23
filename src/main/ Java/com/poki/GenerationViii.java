package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationViii{

	@JsonProperty("legends-arceus")
	private LegendsArceus legendsArceus;

	@JsonProperty("sword-shield")
	private SwordShield swordShield;

	@JsonProperty("brilliant-diamond-shining-pearl")
	private BrilliantDiamondShiningPearl brilliantDiamondShiningPearl;

	public void setLegendsArceus(LegendsArceus legendsArceus){
		this.legendsArceus = legendsArceus;
	}

	public LegendsArceus getLegendsArceus(){
		return legendsArceus;
	}

	public void setSwordShield(SwordShield swordShield){
		this.swordShield = swordShield;
	}

	public SwordShield getSwordShield(){
		return swordShield;
	}

	public void setBrilliantDiamondShiningPearl(BrilliantDiamondShiningPearl brilliantDiamondShiningPearl){
		this.brilliantDiamondShiningPearl = brilliantDiamondShiningPearl;
	}

	public BrilliantDiamondShiningPearl getBrilliantDiamondShiningPearl(){
		return brilliantDiamondShiningPearl;
	}

	@Override
 	public String toString(){
		return 
			"GenerationViii{" + 
			"legends-arceus = '" + legendsArceus + '\'' + 
			",sword-shield = '" + swordShield + '\'' + 
			",brilliant-diamond-shining-pearl = '" + brilliantDiamondShiningPearl + '\'' + 
			"}";
		}
}