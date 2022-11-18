package srl.neotech.corsojava;

import java.util.Random;

public class Startup {

	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto();
		Random r = new Random();
		
				//Creazione di 10000 passeggeri random 
				for (Integer i=0; i<1000;i++) {
					//randomizzazione della classe del passeggero
					Passeggero p=new Passeggero();
					
					Integer tipo=r.nextInt(3);
					if (tipo==0) {
						p=new Business();
					}
					else if (tipo==1) {
						p=new Excelsior();
					}
					else {
						p=new Turista();
					}
					p.setIdUnivoco(i+1);
					//maschio/femmina
					Integer mof=r.nextInt(0, 2);
					if (mof==0) {
						p.setMF('F');
						p.setHasFiore(true);}
					else if (mof==1) {
						p.setMF('M');
						p.setHasFiore(false);
					}
					
					
					p.setEta(r.nextInt(1,100));
					
					
					Integer bagaglio=r.nextInt(1, 3);
					if (bagaglio==1) p.setHasBagagli(false);
					else p.setHasBagagli(true);
					
					aeroporto.getListaPasseggeri().add(p);
					System.out.println(p.toString());			
				}
				System.out.println(aeroporto.getListaPasseggeri().size());
		
				//creazione 300 aerei
				for (int j=0; j<300;j++) {
					Aereo a=new Aereo();
					
					Integer model=r.nextInt(4);
					if (model== 0)	a=new ModelloAereo("Airbus A300","AA123",100);
					else if (model== 1)	 a=new ModelloAereo("Airbus A310","AA235",70);
					else if (model== 2)	 a=new ModelloAereo("Boeing 747","BB768",110);
					else a=new ModelloAereo("Airbus A330","AA457",130);
					
					a.setIdUnivoco(j+1);
				
					a.setCompagniaAerea();
					//voli in partenza
					if (j<100) {
						
						a.setOrario(r.nextInt(1, 19)*10);
						a.setDistanzaDallAeroporto(0);
						a.setVelocita(0);
						a.setStatoAereo(StatoAereo.IN_PARTENZA);
						
						aeroporto.getListaAereiInPartenza().add(a);
						System.out.println(a.toString());
					}
					
					else if (j>=200) {
						//voli in arrivo
						
						a.setOrario(r.nextInt(1, 19)*10);
						a.setDistanzaDallAeroporto(r.nextInt(1, 500));
						a.setVelocita(r.nextInt(1, 11));
												
						if (a.getDistanzaDallAeroporto()>100) { a.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);}
						else {a.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);}
						aeroporto.getListaAereiInAvvicinamento().add(a);
						System.out.println(a.toString());
					}
				}

					//Far decollare ogni Aereo in arereiInPartenza finchè non siano tutti partiti e fuori dal raggio d'azione
					for(Aereo a:aeroporto.getListaAereiInPartenza()) {	
						System.out.println(a);
						for(Passeggero p:aeroporto.getListaPasseggeri()) {
							
							System.out.println(aeroporto.checkin(p));		
						}
						a.setVelocita(r.nextInt(1, 10));
							while(a.getDistanzaDallAeroporto()<aeroporto.RAGGIODIAZIONE) {
								a.setDistanzaDallAeroporto(a.getDistanzaDallAeroporto()+a.getVelocita());
								if(a.getDistanzaDallAeroporto()>=1) {
									a.setStatoAereo(StatoAereo.DECOLLATO);
								}
								if(a.getDistanzaDallAeroporto()>=100) {
									a.setStatoAereo(StatoAereo.FUORI_SPAZIO_AEREO);
								}
									System.out.println(a);
									
									}
						System.out.println();
						}
						
				//per ogni aereiInAvvicinamento farlo atterrare finchè non abbiamo eseguito il checkout tutti i passeggeri a bordo..
					for(Aereo a: aeroporto.getListaAereiInAvvicinamento()) {
						System.out.println(a);
						while(a.getDistanzaDallAeroporto()>0) {
						a.setDistanzaDallAeroporto(a.getDistanzaDallAeroporto()-a.getVelocita());
						if(a.getDistanzaDallAeroporto()<=100) {
							a.setStatoAereo(StatoAereo.IN_AVVICINAMENTO);
						}
						if(a.getDistanzaDallAeroporto()<=0) {
							a.setStatoAereo(StatoAereo.ATTERRATO);	
						}
							System.out.println(a);
							}
						for(Passeggero p :aeroporto.getListaPasseggeri()) {
							System.out.println(p);
						}
						System.out.println();
				}
			}
	}
					
			
					
				
		
