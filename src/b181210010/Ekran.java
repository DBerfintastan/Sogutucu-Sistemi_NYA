package b181210010;

import java.util.*;

import b181210010.Kullanici.KullaniciBuilder;

public class Ekran {

	public static void main(String[] args) {
		IMenu menu = new Menu();

		Scanner girdi = new Scanner(System.in);
		Scanner girdi2 = new Scanner(System.in);
		System.out.println("Kullanici Adi Giriniz:");
		String kullaniciAdi = girdi.next();
		System.out.println("Sifre Giriniz:");
		String sifre = girdi2.next();

		Kullanici kullanici = new Kullanici.KullaniciBuilder(kullaniciAdi, sifre).kullanici(kullaniciAdi).sifre(sifre)
				.build(); //Builder kullanýmý

		if (kullanici.kullaniciKontrol() == true) {
			System.out.println("Giris Basarili");
			int secim = 0;
			menu.islemSec(secim);
		} else
			System.out.println("Hatali Giris");

	}

}
