package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIi{

	@JsonProperty("gold")
	private Gold gold;

	@JsonProperty("crystal")
	private Crystal crystal;

	@JsonProperty("silver")
	private Silver silver;

	@JsonProperty("gold-and-silver")
	private GoldAndSilver goldAndSilver;

	public void setGold(Gold gold){
		this.gold = gold;
	}

	public Gold getGold(){
		return gold;
	}

	public void setCrystal(Crystal crystal){
		this.crystal = crystal;
	}

	public Crystal getCrystal(){
		return crystal;
	}

	public void setSilver(Silver silver){
		this.silver = silver;
	}

	public Silver getSilver(){
		return silver;
	}

	public void setGoldAndSilver(GoldAndSilver goldAndSilver){
		this.goldAndSilver = goldAndSilver;
	}

	public GoldAndSilver getGoldAndSilver(){
		return goldAndSilver;
	}

	@Override
 	public String toString(){
		return 
			"GenerationIi{" + 
			"gold = '" + gold + '\'' + 
			",crystal = '" + crystal + '\'' + 
			",silver = '" + silver + '\'' + 
			",gold-and-silver = '" + goldAndSilver + '\'' + 
			"}";
		}
}