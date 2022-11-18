package srl.neotech.corsojava.biblioteca;

import java.util.Random;

public class Startup {
	

	public static void main(String[] args) {
		
				Random r = new Random();
				
				//creazione 100 libri
				for(int i=0;i<100;i++) {
					Libro libro = new Libro();
					libro.setIdLibro(i+1);
					libro.getSezione();
					libro.setScaffale(r.nextInt(1, 4));
					libro.setAutore();
					libro.setTitolo();
					Biblioteca.libri.add(libro);
		
				}
				
				//creazione 100 associati
				for(int j=0;j<100;j++) {
					
					Associato associato =new Associato();
					associato.getStato();
					associato.setNominativo();
					associato.setIdAssociato(j+1);
					//listaidPresi
					for(int i=0;i<(r.nextInt(1, 6));i++) {
						associato.getListaIdLibriPresi().add(r.nextInt(1,Biblioteca.libri.size()));	
					}
					
					Biblioteca.associati.add(associato);
					
				}
			
						
				//aggiungere libro a lista dei libri
				Libro libroNuovo = new Libro();
				libroNuovo.getSezione();
				libroNuovo.setIdLibro(101);
				libroNuovo.setScaffale(r.nextInt(1, 5));
				libroNuovo.setAutore();
				libroNuovo.setTitolo();	
				Biblioteca.libri.add(libroNuovo);
				
				//rimuovere un libro
				Biblioteca.libri.remove(r.nextInt(1, Biblioteca.libri.size()));	
				
				System.out.println(Biblioteca.libri.toString());
				System.out.println(Biblioteca.libri.size());
				
				//aggiungere associato alla lista associati
				Associato associatoNuovo =new Associato();
				associatoNuovo.getStato();
				associatoNuovo.setNominativo();
				associatoNuovo.setIdAssociato(101);
				for(int i=1;i<=(r.nextInt(1, 5));i++) {
					associatoNuovo.getListaIdLibriPresi().add(r.nextInt(1,Biblioteca.libri.size()));	}
				Biblioteca.associati.add(associatoNuovo);
				
				//rimuovere associato dalla lista associati
				Biblioteca.associati.remove(r.nextInt(1, Biblioteca.associati.size()));
				System.out.println(Biblioteca.associati.toString());
				System.out.println(Biblioteca.associati.size());
				
								
	}
	
	}