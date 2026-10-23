package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MovesItem{

	@JsonProperty("version_group_details")
	private List<VersionGroupDetailsItem> versionGroupDetails;

	@JsonProperty("move")
	private Move move;

	public void setVersionGroupDetails(List<VersionGroupDetailsItem> versionGroupDetails){
		this.versionGroupDetails = versionGroupDetails;
	}

	public List<VersionGroupDetailsItem> getVersionGroupDetails(){
		return versionGroupDetails;
	}

	public void setMove(Move move){
		this.move = move;
	}

	public Move getMove(){
		return move;
	}

	@Override
 	public String toString(){
		return 
			"MovesItem{" + 
			"version_group_details = '" + versionGroupDetails + '\'' + 
			",move = '" + move + '\'' + 
			"}";
		}
}