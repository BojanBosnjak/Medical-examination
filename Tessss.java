package ListeZdravstvo;

import java.io.IOException;
import java.util.logging.*;

public class Tessss {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("Vauuuu");
		FileHandler fh;
		//mozda bih ovaj logger mogao da napravim kao posebnu kalsu
		//C:\Users\Bojan Bosnjak\Desktop\bootcamp\Vauuuu.log
//		try {
//			fh = new FileHandler ("C:\\Users\\Bojan Bosnjak\\Desktop\\bootcamp\\Vauuuu.log");
//			log.addHandler(fh);
//			SimpleFormatter form = new SimpleFormatter();
//			fh.setFormatter(form);
//			log.info("Moj log");
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		log.info("Moj log");
//		
		Lekar l1 = new Lekar("Milan", "Chuka", "Kardiolog");
//		log.info("Kreiran lekar Milan");
		Pacijent p1 = new Pacijent("Butch", "Kasidi ", 123699875, 5566, l1);
		Pacijent p2 = new Pacijent("nja", "njanja",65432165, 5566, l1);
		l1.dodajPacijenta(p2);
		System.out.println(l1.toString());
		
		log.info("Kreiran pacijent Butch");
//		l1.dodajPacijenta(p1);
		KrvniPritisak kp1 = new KrvniPritisak("12.10. 2019","08:30", 55);
//		kp1.getDonjaVrednost();
//		kp1.getGornjaVrednost();
//		System.out.println(kp1.getDonjaVrednost());
//		System.out.println(kp1.getGornjaVrednost());
//		System.out.println(kp1.getPuls());
		Secer s1= new Secer("12.10.2019", "07:30", 8.1, "20:30");
		//System.out.println(s1.getVrednost());
//		log.info("Zakazan Pregled za secer");
//		l1.zakaziPregled(s1, p1);
//		log.info("Zakazan pregled za pritisak");
//		l1.zakaziPregled(kp1, p1);
//		System.out.println(l1.toString());
	//	l1.dodajPacijenta(null);
//		l1.listaPacijenata();
//		l1.toString();
//		System.out.println(l1.toString());

	}

}
