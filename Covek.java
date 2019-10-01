package ListeZdravstvo;

public abstract class Covek {
	public String ime;
	public String prezime;
	
	public Covek(String ime, String prezime) {
		this.ime=ime;
		this.prezime=prezime;
	}
	public abstract String Covek();
}
