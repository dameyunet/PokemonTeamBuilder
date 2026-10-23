package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenerationVi{

	@JsonProperty("x-y")
	private XY xY;

	@JsonProperty("omega-ruby-alpha-sapphire")
	private OmegaRubyAlphaSapphire omegaRubyAlphaSapphire;

	@JsonProperty("icons")
	private Icons icons;

	public void setXY(XY xY){
		this.xY = xY;
	}

	public XY getXY(){
		return xY;
	}

	public void setOmegaRubyAlphaSapphire(OmegaRubyAlphaSapphire omegaRubyAlphaSapphire){
		this.omegaRubyAlphaSapphire = omegaRubyAlphaSapphire;
	}

	public OmegaRubyAlphaSapphire getOmegaRubyAlphaSapphire(){
		return omegaRubyAlphaSapphire;
	}

	public void setIcons(Icons icons){
		this.icons = icons;
	}

	public Icons getIcons(){
		return icons;
	}

	@Override
 	public String toString(){
		return 
			"GenerationVi{" + 
			"x-y = '" + xY + '\'' + 
			",omega-ruby-alpha-sapphire = '" + omegaRubyAlphaSapphire + '\'' + 
			",icons = '" + icons + '\'' + 
			"}";
		}
}