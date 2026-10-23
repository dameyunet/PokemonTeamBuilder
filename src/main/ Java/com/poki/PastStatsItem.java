package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PastStatsItem{

	@JsonProperty("generation")
	private Generation generation;

	@JsonProperty("stats")
	private List<StatsItem> stats;

	public void setGeneration(Generation generation){
		this.generation = generation;
	}

	public Generation getGeneration(){
		return generation;
	}

	public void setStats(List<StatsItem> stats){
		this.stats = stats;
	}

	public List<StatsItem> getStats(){
		return stats;
	}

	@Override
 	public String toString(){
		return 
			"PastStatsItem{" + 
			"generation = '" + generation + '\'' + 
			",stats = '" + stats + '\'' + 
			"}";
		}
}