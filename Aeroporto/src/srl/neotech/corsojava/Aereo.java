package srl.neotech.corsojava;

import java.util.Random;

public class Aereo {
	
	private Integer idUnivoco;
	private Integer orario;
	private String compagniaAerea;
	private ModelloAereo modello;
	private Integer velocita;
	private Integer distanzaDallAeroporto;
	private StatoAereo statoAereo;
	
	Random r = new Random();
	
	public StatoAereo getStatoAereo() {
		return getStatoAereo();
	}
	public void setStatoAereo(StatoAereo statoAereo) {
		this.statoAereo = statoAereo;
	}
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public Integer getOrario() {
		return orario;
	}
	public void setOrario(Integer orario) {
		this.orario = orario;
	}
	public String getCompagniaAerea() {
		return compagniaAerea;
	}
	public void setCompagniaAerea() {
		String []compagnia = {"Ryanair","Easyjet","ItaAirways","Klm","BritishAirways","Lufthansa"};
		this.compagniaAerea = compagnia[r.nextInt(6)];
	}
	
	public ModelloAereo getModello() {
		return modello;
	}
	public void setModello(ModelloAereo modello) {
		this.modello = modello;
	}
	public Integer getVelocita() {
		return velocita;
	}
	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}
	public Integer getDistanzaDallAeroporto() {
		return distanzaDallAeroporto;
	}
	public void setDistanzaDallAeroporto(Integer distanzaDallAeroporto) {
		this.distanzaDallAeroporto = distanzaDallAeroporto;
	}
	
	@Override
	public String toString() {
		return "Aereo [idUnivoco=" + idUnivoco + ", orario=" + orario + ", compagniaAerea=" + compagniaAerea
				+ ", velocita=" + velocita + ", distanzaDallAeroporto=" + distanzaDallAeroporto
				+ ", statoAereo=" + statoAereo +", modello=" + modello +"]";
	}
	
	
	
}
