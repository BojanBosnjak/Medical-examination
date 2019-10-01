package ListeZdravstvo;

public class Secer extends LabPregled {
	private double vrednost;
	private String vremeObroka;

	public Secer(String datum, String vreme, double vrednost, String vremeObroka) {
		super(datum, vreme);
		this.vrednost = vrednost;
		this.vremeObroka = vremeObroka;
	}

//3.86-7.00
	public double getVrednost() {
		//ovde sam stavio if-ove jer sam smatrao da ne bi bilo lose da odmah ubacim i rezultate pregleda
		//Medjutim, ovo su samo rezultati, brojcano, a lekar daje poslednju ocenu da li je dobro ili ne

//		if (vrednost < 3.86)
//			System.out.println("Nizak secer");
//		else if (vrednost > 3.86 && vrednost < 7.0)
//			System.out.println("Normalan secer");
//		else
//			System.out.println("Povisen secer");
		return vrednost;
	}

	public String getVremeObroka() {
		return vremeObroka;
	}
	@Override
	public String pregled() { //polimorfizam
		String s = "Zakazan za " + datum + " u " + vreme + " casova ";
		return s;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pregled()+ " Nivo secera: " + getVrednost());
		return sb.toString();
	}

	
}
