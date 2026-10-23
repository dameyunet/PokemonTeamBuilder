package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionGroupDetailsItem{

	@JsonProperty("level_learned_at")
	private int levelLearnedAt;

	@JsonProperty("version_group")
	private VersionGroup versionGroup;

	@JsonProperty("move_learn_method")
	private MoveLearnMethod moveLearnMethod;

	@JsonProperty("order")
	private Object order;

	public void setLevelLearnedAt(int levelLearnedAt){
		this.levelLearnedAt = levelLearnedAt;
	}

	public int getLevelLearnedAt(){
		return levelLearnedAt;
	}

	public void setVersionGroup(VersionGroup versionGroup){
		this.versionGroup = versionGroup;
	}

	public VersionGroup getVersionGroup(){
		return versionGroup;
	}

	public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod){
		this.moveLearnMethod = moveLearnMethod;
	}

	public MoveLearnMethod getMoveLearnMethod(){
		return moveLearnMethod;
	}

	public void setOrder(Object order){
		this.order = order;
	}

	public Object getOrder(){
		return order;
	}

	@Override
 	public String toString(){
		return 
			"VersionGroupDetailsItem{" + 
			"level_learned_at = '" + levelLearnedAt + '\'' + 
			",version_group = '" + versionGroup + '\'' + 
			",move_learn_method = '" + moveLearnMethod + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}