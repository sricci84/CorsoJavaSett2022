package srl.neotech.corsojava.fabbrica;

import java.util.Random;

public class Cisterna {
	
	private Integer quantita;
	private Integer evapPerDay;
	private Integer livelloGas;
	private String materialeCisterna;
	
	static final int THRESHOLD=30;
	
	Random r = new Random();
	
	public Integer getQuantita() {
		return quantita;
	}
	public void setQuantita() {
		
		this.quantita =r.nextInt(0, 1001);
	}
	
	
	public Integer getEvapPerDay() {
		return evapPerDay;
	}
	public void setEvapPerDay() {
		this.evapPerDay = r.nextInt(1, 11);
	}
	
	
	public Integer getLivelloGas() {
		return livelloGas;
	}
	public void setLivelloGas() {
		this.livelloGas = r.nextInt(0, 101);
	}
	
	
	public String getMaterialeCisterna() {
		return materialeCisterna;
	}
	public void setMaterialeCisterna() {
		final String[] materiale = {"Alluminio","Rame","Acciaio"};
		this.materialeCisterna = materiale[r.nextInt(3)];
	}
		
}
