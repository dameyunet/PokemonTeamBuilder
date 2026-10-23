package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationIv{

	@JsonProperty("platinum")
	private Platinum platinum;

	@JsonProperty("diamond-pearl")
	private DiamondPearl diamondPearl;

	@JsonProperty("icons")
	private Icons icons;

	@JsonProperty("heartgold-soulsilver")
	private HeartgoldSoulsilver heartgoldSoulsilver;

	public void setPlatinum(Platinum platinum){
		this.platinum = platinum;
	}

	public Platinum getPlatinum(){
		return platinum;
	}

	public void setDiamondPearl(DiamondPearl diamondPearl){
		this.diamondPearl = diamondPearl;
	}

	public DiamondPearl getDiamondPearl(){
		return diamondPearl;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver){
		this.heartgoldSoulsilver = heartgoldSoulsilver;
	}

	public HeartgoldSoulsilver getHeartgoldSoulsilver(){
		return heartgoldSoulsilver;
	}

	@Override
 	public String toString(){
		return 
			"GenerationIv{" + 
			"platinum = '" + platinum + '\'' + 
			",diamond-pearl = '" + diamondPearl + '\'' + 
			",icons = '" + icons + '\'' + 
			",heartgold-soulsilver = '" + heartgoldSoulsilver + '\'' + 
			"}";
		}
}