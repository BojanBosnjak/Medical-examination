package ListeZdravstvo;

public abstract class LabPregled {
	public String datum;
	public String vreme;
	
	public LabPregled(String datum, String vreme) {
		this.datum=datum;
		this.vreme=vreme;
	}
	public abstract String pregled();
}
