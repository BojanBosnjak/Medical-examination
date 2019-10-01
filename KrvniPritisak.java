package ListeZdravstvo;

import java.util.Random;

public class KrvniPritisak extends LabPregled {
	// podesio sam ga da nasumicno generise brojeve za krvni pritisak, mada to moze
	// da bude i uradjeno rucno
//	private int gornjaVrednost;
//	private int donjaVrednost;
	private int puls;

	public KrvniPritisak(String datum, String vreme, int puls) {// int gornjaVrednost, int donjaVrednost,
		super(datum, vreme);
//		this.gornjaVrednost=gornjaVrednost;
//		this.donjaVrednost=donjaVrednost;
		this.puls = puls;
	}

	public int getGornjaVrednost() {
		Random r = new Random();
		int g1 = 100;
		int g2 = 250;
		int vrednost = r.nextInt(g2 - g1) + g1;
		if (vrednost < 110)
			System.out.println("Poboljsati gornji pritisak");
		else if (vrednost > 110 && vrednost < 130)
			System.out.println("Gornji pritisak je ok");
//		else if (vrednost >130 && vrednost <150) 
//			System.out.println("Povisen gornji pritisak");
		else
			System.out.println("Visok gornji pritisak!");
		return vrednost;
	}

	public int getDonjaVrednost() {
		Random r = new Random();
		int d1 = 50;
		int d2 = 120;
		int vrednost = r.nextInt(d2 - d1) + d1;
		//ovde sam stavio if-ove jer sam smatrao da ne bi bilo lose da odmah ubacim i rezultate pregleda
				//Medjutim, ovo su samo rezultati, brojcano, a lekar daje poslednju ocenu da li je dobro ili ne
		
//		if (vrednost < 60)
//			System.out.println("Mnogo nisko!");
//		else if (vrednost > 60 && vrednost < 90)
//			System.out.println("Donji pritisak je ok");
//		else if (vrednost >90 && vrednost <110) 
//			System.out.println("Povisen donji pritisak");
//		else
//			System.out.println("Katastrofa!");
		return vrednost;
	}

	public int getPuls() {// normalan puls je od 60 do 100 otkucaja u minuti.
		//ovde sam stavio if-ove jer sam smatrao da ne bi bilo lose da odmah ubacim i rezultate pregleda
		//Medjutim, ovo su samo rezultati, brojcano, a lekar daje poslednju ocenu da li je dobro ili ne
		
		// ispod 60 si zmija
		// preko 100 si u problemu
//		if (puls < 60)
//			System.out.println("Zmijo!");
//		else if (puls > 60 && puls < 100)
//			System.out.println("Taman");
//		else
//			System.out.println("Uspori");

		return puls;
	}
	@Override
	public String pregled() {//polimorfizam
		String s="Zakazan za " + datum + " u " + vreme + " casova ";
		return s;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(pregled() + " GV: " + getGornjaVrednost() + " DV: "
				+ getDonjaVrednost() + " Puls: " + getPuls());
		return sb.toString();
	}


}
