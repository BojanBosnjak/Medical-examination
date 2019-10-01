package ListeZdravstvo;

import java.time.LocalDate;

public class Holesterol extends LabPregled{
	private double vrednost;
	private String vremeObroka;
	
	public Holesterol(String datum, String vreme, double Vrednost, String vremeObroka) {
		super(datum, vreme);
		this.vrednost=vrednost;
		this.vremeObroka=vremeObroka;
	}
//1.03-1.55
	public double getVrednost() {
		//ovde sam stavio if-ove jer sam smatrao da ne bi bilo lose da odmah ubacim i rezultate pregleda
		//Medjutim, ovo su samo rezultati, brojcano, a lekar daje poslednju ocenu da li je dobro ili ne
		
//		if (vrednost < 1.03)
//			System.out.println("Nize od normalnog nivoa");
//		else if (vrednost >= 1.03 && vrednost<=1.55)
//			System.out.println("Normalna vrednost holesterola");
//		else 
//			System.out.println("Povisen holesterol");
		return vrednost;
	}

	public String getVremeObroka() {
		return vremeObroka;
	}
	@Override
	public String pregled() {//polimorfizam
		String s = "Zakazan za " + datum + " u " + vreme + " casova ";
		return s;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pregled() + " Holesterol: " + getVrednost());
		return sb.toString();
	}
	
}
