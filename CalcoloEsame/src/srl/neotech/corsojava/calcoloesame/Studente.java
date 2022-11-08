package srl.neotech.corsojava.calcoloesame;

public class Studente {
	
	private int votoScritto;
	private int votoOrale;
	
	
	public int getVotoScritto() {
		return votoScritto;
	}
	public void setVotoScritto(int votoScritto) {
		this.votoScritto = votoScritto;
	}
	public int getVotoOrale() {
		return votoOrale;
	}
	public void setVotoOrale(int votoOrale) {
		this.votoOrale = votoOrale;
	}
	
	public Studente(int votoScritto, int votoOrale) {
		super();
		this.votoScritto = votoScritto;
		this.votoOrale = votoOrale;
	}
}
