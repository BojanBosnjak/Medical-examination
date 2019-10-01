package ListeZdravstvo;

public class Pacijent extends Covek {
	private int jmbg;
	private int brKartona;
	private Lekar doktor;
	private int brPregleda;

	public Pacijent(String ime, String prezime, int jmbg, int brKartona, Lekar doktor) {
		super(ime, prezime);
		this.jmbg = jmbg;
		this.brKartona = brKartona;
		this.doktor = doktor;
	}

	public int getBrKartona() {
		return brKartona;
	}

	public void setBrKartona(int brKartona) {
		this.brKartona = brKartona;
	}

	public int getJmbg() {
		return jmbg;
	}

	public void setDoktor(Lekar doktor) {
		this.doktor = doktor;
	}


	@Override
	public String Covek() {
		String s = "Pacijent: " + ime + " " + prezime;
		return s;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Covek() + getJmbg() + getBrKartona());
		return sb.toString();
	}

}
