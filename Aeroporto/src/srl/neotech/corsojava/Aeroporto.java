package srl.neotech.corsojava;

import java.util.ArrayList;

public class Aeroporto {
	
	private ArrayList<Aereo>listaAerei=new ArrayList<Aereo>();
	private ArrayList<Passeggero>listaPasseggeri=new ArrayList<Passeggero>();
	
	private ArrayList<Aereo>listaAereiInPartenza=new ArrayList<Aereo>();
	private ArrayList<Aereo>listaAereiInAvvicinamento=new ArrayList<Aereo>();
	
	final Integer RAGGIODIAZIONE=100;
		
	
	public ArrayList<Aereo> getListaAereiInPartenza() {
		return listaAereiInPartenza;
	}
	public void setListaAereiInPartenza(ArrayList<Aereo> listaAereiInPartenza) {
		this.listaAereiInPartenza = listaAereiInPartenza;
	}
	
	public ArrayList<Aereo> getListaAereiInAvvicinamento() {
		return listaAereiInAvvicinamento;
	}
	public void setListaAereiInAvvicinamento(ArrayList<Aereo> listaAereiInAvvicinamento) {
		this.listaAereiInAvvicinamento = listaAereiInAvvicinamento;
	}
	
	
	
	public ArrayList<Aereo> getListaAerei() {
		return listaAerei;
	}
	public void setListaAerei(ArrayList<Aereo> listaAerei) {
		this.listaAerei = listaAerei;
	}
	public ArrayList<Passeggero> getListaPasseggeri() {
		return listaPasseggeri;
	}
	public void setListaPasseggeri(ArrayList<Passeggero> listaPasseggeri) {
		this.listaPasseggeri = listaPasseggeri;
	}

	//atterraggio
	public Aereo atterraggio(Aereo a) {
		if(a.getStatoAereo().equals(StatoAereo.IN_AVVICINAMENTO)) {
			a.setStatoAereo(StatoAereo.ATTERRATO);
			System.out.println("aereo: "+a.getIdUnivoco()+ " atterrato");
		}
		return a;
	}
	//decollo
	public Aereo decollo(Aereo a) {
		if(a.getStatoAereo().equals(StatoAereo.IN_PARTENZA)) {
			a.setStatoAereo(StatoAereo.DECOLLATO);
			System.out.println("aereo: "+a.getIdUnivoco()+ " in decollo");
		}
		return a;
	}
	//checkin
	public Passeggero checkin(Passeggero p) {
		System.out.println("in checkin: ");
		return p;
	}
	//checkout
	public Passeggero checkout(Passeggero p) {
		System.out.println("in checkout: "+p);
		return p;
	}
}
	
