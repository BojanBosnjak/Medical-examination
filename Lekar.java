package ListeZdravstvo;

import java.util.ArrayList;
import java.util.Scanner;

public class Lekar extends Covek {
	private String specijalnost;
//	private Pacijent[] pacijenti;
	private ArrayList<Pacijent> pacijent;
	

//	private LabPregled[] pregledi;
//	private Pacijent pac;
//	private int brPac;

	public Lekar(String ime, String prezime, String specijalnost) {
		super(ime, prezime);
		this.specijalnost = specijalnost;
		pacijent = new ArrayList<Pacijent>();
//		this.pacijenti = new Pacijent[5];
//		this.pregledi = new LabPregled[5];

	}

	public String getSpecijalnost() {
		return specijalnost;
	}

	public void setSpecijalnost(String specijalnost) {
		this.specijalnost = specijalnost;
	}
		
	public boolean dodajPacijenta(Pacijent pac) {
		return pacijent.add(pac);
	}
	public boolean ukloniPacijenta(Pacijent pac) {
		return pacijent.remove(pac);
	}
	public Pacijent dohvatiPacijenta(int poz) {
		return pacijent.get(poz);
	}
//	public String ispisPacijenata() {
//		String s="";
//		for (int i=0; i>pacijent.size(); i++) {
//			s+= i + pacijent.get(i).getBrKartona()+super.ime+super.prezime;
//		}
//		return s;
//	}

	@Override
	public String toString() {
		String s="";
		for (int i=0; i>pacijent.size(); i++) {
			s+= i + pacijent.get(i).getBrKartona()+super.ime+super.prezime;
		}
		return s;
		}

	@Override
	public String Covek() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
