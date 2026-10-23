package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pokemon{

	@JsonProperty("location_area_encounters")
	private String locationAreaEncounters;

	@JsonProperty("cries")
	private Cries cries;

	@JsonProperty("past_stats")
	private List<PastStatsItem> pastStats;

	@JsonProperty("types")
	private List<TypesItem> types;

	@JsonProperty("base_experience")
	private int baseExperience;

	@JsonProperty("held_items")
	private List<HeldItemsItem> heldItems;

	@JsonProperty("weight")
	private int weight;

	@JsonProperty("is_default")
	private boolean isDefault;

	@JsonProperty("sprites")
	private Sprites sprites;

	@JsonProperty("past_types")
	private List<Object> pastTypes;

	@JsonProperty("past_abilities")
	private List<PastAbilitiesItem> pastAbilities;

	@JsonProperty("abilities")
	private List<AbilitiesItem> abilities;

	@JsonProperty("game_indices")
	private List<GameIndicesItem> gameIndices;

	@JsonProperty("species")
	private Species species;

	@JsonProperty("stats")
	private List<StatsItem> stats;

	@JsonProperty("moves")
	private List<MovesItem> moves;

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	@JsonProperty("forms")
	private List<FormsItem> forms;

	@JsonProperty("height")
	private int height;

	@JsonProperty("order")
	private int order;

	public void setLocationAreaEncounters(String locationAreaEncounters){
		this.locationAreaEncounters = locationAreaEncounters;
	}

	public String getLocationAreaEncounters(){
		return locationAreaEncounters;
	}

	public void setCries(Cries cries){
		this.cries = cries;
	}

	public Cries getCries(){
		return cries;
	}

	public void setPastStats(List<PastStatsItem> pastStats){
		this.pastStats = pastStats;
	}

	public List<PastStatsItem> getPastStats(){
		return pastStats;
	}

	public void setTypes(List<TypesItem> types){
		this.types = types;
	}

	public List<TypesItem> getTypes(){
		return types;
	}

	public void setBaseExperience(int baseExperience){
		this.baseExperience = baseExperience;
	}

	public int getBaseExperience(){
		return baseExperience;
	}

	public void setHeldItems(List<HeldItemsItem> heldItems){
		this.heldItems = heldItems;
	}

	public List<HeldItemsItem> getHeldItems(){
		return heldItems;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setIsDefault(boolean isDefault){
		this.isDefault = isDefault;
	}

	public boolean isIsDefault(){
		return isDefault;
	}

	public void setSprites(Sprites sprites){
		this.sprites = sprites;
	}

	public Sprites getSprites(){
		return sprites;
	}

	public void setPastTypes(List<Object> pastTypes){
		this.pastTypes = pastTypes;
	}

	public List<Object> getPastTypes(){
		return pastTypes;
	}

	public void setPastAbilities(List<PastAbilitiesItem> pastAbilities){
		this.pastAbilities = pastAbilities;
	}

	public List<PastAbilitiesItem> getPastAbilities(){
		return pastAbilities;
	}

	public void setAbilities(List<AbilitiesItem> abilities){
		this.abilities = abilities;
	}

	public List<AbilitiesItem> getAbilities(){
		return abilities;
	}

	public void setGameIndices(List<GameIndicesItem> gameIndices){
		this.gameIndices = gameIndices;
	}

	public List<GameIndicesItem> getGameIndices(){
		return gameIndices;
	}

	public void setSpecies(Species species){
		this.species = species;
	}

	public Species getSpecies(){
		return species;
	}

	public void setStats(List<StatsItem> stats){
		this.stats = stats;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	public void setMoves(List<MovesItem> moves){
		this.moves = moves;
	}

	public List<MovesItem> getMoves(){
		return moves;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setForms(List<FormsItem> forms){
		this.forms = forms;
	}

	public List<FormsItem> getForms(){
		return forms;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	public void setOrder(int order){
		this.order = order;
	}

	public int getOrder(){
		return order;
	}

	@Override
 	public String toString(){
		return 
			"Pokemon{" + 
			"location_area_encounters = '" + locationAreaEncounters + '\'' + 
			",cries = '" + cries + '\'' + 
			",past_stats = '" + pastStats + '\'' + 
			",types = '" + types + '\'' + 
			",base_experience = '" + baseExperience + '\'' + 
			",held_items = '" + heldItems + '\'' + 
			",weight = '" + weight + '\'' + 
			",is_default = '" + isDefault + '\'' + 
			",sprites = '" + sprites + '\'' + 
			",past_types = '" + pastTypes + '\'' + 
			",past_abilities = '" + pastAbilities + '\'' + 
			",abilities = '" + abilities + '\'' + 
			",game_indices = '" + gameIndices + '\'' + 
			",species = '" + species + '\'' + 
			",stats = '" + stats + '\'' + 
			",moves = '" + moves + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",forms = '" + forms + '\'' + 
			",height = '" + height + '\'' + 
			",order = '" + order + '\'' + 
			"}";
		}
}