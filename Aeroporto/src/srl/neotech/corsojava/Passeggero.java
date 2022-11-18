package srl.neotech.corsojava;

public class Passeggero {
	
	private Integer idUnivoco;
	private char MF;
	private Boolean hasFiore=false;
	private Integer eta;
	private Boolean hasBagagli;
	private TipoPasseggero tipoPasseggero;
	
	public Integer getIdUnivoco() {
		return idUnivoco;
	}
	public void setIdUnivoco(Integer idUnivoco) {
		this.idUnivoco = idUnivoco;
	}
	public char getMF() {
		return MF;
	}
	public void setMF(char mF) {
		MF = mF;
	}
	public Boolean getHasFiore() {
		return hasFiore;
	}
	public void setHasFiore(Boolean hasFiore) {
		this.hasFiore = hasFiore;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	public Boolean getHasBagagli() {
		return hasBagagli;
	}
	public void setHasBagagli(Boolean hasBagagli) {
		this.hasBagagli = hasBagagli;
	}

	public TipoPasseggero getTipoPasseggero() {
		return tipoPasseggero;
	}
	public void setTipoPasseggero(TipoPasseggero tipoPasseggero) {
		this.tipoPasseggero = tipoPasseggero;
	}
	@Override
	public String toString() {
		return "Passeggero [idUnivoco=" + idUnivoco + ", MF=" + MF + ", hasFiore=" + hasFiore + ", eta=" + eta
				+ ", hasBagagli=" + hasBagagli + ", tipoPasseggero=" + tipoPasseggero +"]";
	}
	
	
	
	

}
