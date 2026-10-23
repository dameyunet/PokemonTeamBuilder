package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AbilitiesItem{

	@JsonProperty("is_hidden")
	private boolean isHidden;

	@JsonProperty("slot")
	private int slot;

	@JsonProperty("ability")
	private Object ability;

	public void setIsHidden(boolean isHidden){
		this.isHidden = isHidden;
	}

	public boolean isIsHidden(){
		return isHidden;
	}

	public void setSlot(int slot){
		this.slot = slot;
	}

	public int getSlot(){
		return slot;
	}

	public void setAbility(Object ability){
		this.ability = ability;
	}

	public Object getAbility(){
		return ability;
	}

	@Override
 	public String toString(){
		return 
			"AbilitiesItem{" + 
			"is_hidden = '" + isHidden + '\'' + 
			",slot = '" + slot + '\'' + 
			",ability = '" + ability + '\'' + 
			"}";
		}
}