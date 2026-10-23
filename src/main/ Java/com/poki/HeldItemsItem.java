package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HeldItemsItem{

	@JsonProperty("item")
	private Item item;

	@JsonProperty("version_details")
	private List<VersionDetailsItem> versionDetails;

	public void setItem(Item item){
		this.item = item;
	}

	public Item getItem(){
		return item;
	}

	public void setVersionDetails(List<VersionDetailsItem> versionDetails){
		this.versionDetails = versionDetails;
	}

	public List<VersionDetailsItem> getVersionDetails(){
		return versionDetails;
	}

	@Override
 	public String toString(){
		return 
			"HeldItemsItem{" + 
			"item = '" + item + '\'' + 
			",version_details = '" + versionDetails + '\'' + 
			"}";
		}
}