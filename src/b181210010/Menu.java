package b181210010;

import java.util.Scanner;

public class Menu implements IMenu{

	public void islemGoruntule() {
		System.out.println("-------------------------------------------");
		System.out.println("ISLEM SECINIZ:");
		System.out.println("1.Sicaklik Goruntule");
		System.out.println("2.Sogutucu Ac");
		System.out.println("3.Sogutucu Kapat");
		System.out.println("4.Cikis");

	}

	public void islemSec(int secim) {
		IEyleyici eyleyici = new Eyleyici(false);
		IAlgilayici algilayici = new Algilayici(0);
		while (secim != 4) {
			islemGoruntule();
			Scanner girdi = new Scanner(System.in);
			secim = girdi.nextInt();
			switch (secim) {
			case 1:
				algilayici.sicaklikOlc();
				break;
			case 2:
				if (eyleyici.isSogutucuDurum() == false)
					eyleyici.sogutucuAc();
				else
					System.out.println("Sogutucu zaten acik");
				break;
			case 3:
				if (eyleyici.isSogutucuDurum() == true)
					eyleyici.sogutucuKapat();
				else
					System.out.println("Sogutucu zaten kapali");
				break;
			case 4:
				System.out.println("Cikis Yapildi");
				break;
			default:
				System.out.println("Hatali Secim");
			}

		}
	}


}
