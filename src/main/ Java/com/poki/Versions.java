package com.poki;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Versions{

	@JsonProperty("generation-iii")
	private GenerationIii generationIii;

	@JsonProperty("generation-ix")
	private GenerationIx generationIx;

	@JsonProperty("generation-v")
	private GenerationV generationV;

	@JsonProperty("generation-ii")
	private GenerationIi generationIi;

	@JsonProperty("generation-iv")
	private GenerationIv generationIv;

	@JsonProperty("generation-vii")
	private GenerationVii generationVii;

	@JsonProperty("generation-i")
	private GenerationI generationI;

	@JsonProperty("generation-viii")
	private GenerationViii generationViii;

	@JsonProperty("generation-vi")
	private GenerationVi generationVi;

	public void setGenerationIii(GenerationIii generationIii){
		this.generationIii = generationIii;
	}

	public GenerationIii getGenerationIii(){
		return generationIii;
	}

	public void setGenerationIx(GenerationIx generationIx){
		this.generationIx = generationIx;
	}

	public GenerationIx getGenerationIx(){
		return generationIx;
	}

	public void setGenerationV(GenerationV generationV){
		this.generationV = generationV;
	}

	public GenerationV getGenerationV(){
		return generationV;
	}

	public void setGenerationIi(GenerationIi generationIi){
		this.generationIi = generationIi;
	}

	public GenerationIi getGenerationIi(){
		return generationIi;
	}

	public void setGenerationIv(GenerationIv generationIv){
		this.generationIv = generationIv;
	}

	public GenerationIv getGenerationIv(){
		return generationIv;
	}

	public void setGenerationVii(GenerationVii generationVii){
		this.generationVii = generationVii;
	}

	public GenerationVii getGenerationVii(){
		return generationVii;
	}

	public void setGenerationI(GenerationI generationI){
		this.generationI = generationI;
	}

	public GenerationI getGenerationI(){
		return generationI;
	}

	public void setGenerationViii(GenerationViii generationViii){
		this.generationViii = generationViii;
	}

	public GenerationViii getGenerationViii(){
		return generationViii;
	}

	public void setGenerationVi(GenerationVi generationVi){
		this.generationVi = generationVi;
	}

	public GenerationVi getGenerationVi(){
		return generationVi;
	}

	@Override
 	public String toString(){
		return 
			"Versions{" + 
			"generation-iii = '" + generationIii + '\'' + 
			",generation-ix = '" + generationIx + '\'' + 
			",generation-v = '" + generationV + '\'' + 
			",generation-ii = '" + generationIi + '\'' + 
			",generation-iv = '" + generationIv + '\'' + 
			",generation-vii = '" + generationVii + '\'' + 
			",generation-i = '" + generationI + '\'' + 
			",generation-viii = '" + generationViii + '\'' + 
			",generation-vi = '" + generationVi + '\'' + 
			"}";
		}
}