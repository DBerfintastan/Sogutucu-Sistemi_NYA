package b181210010;

import java.util.Scanner;

public class Kullanici {
	private String kullaniciAdi, sifre;
	Database db=new Database();
	private Kullanici(KullaniciBuilder builder) {
		this.kullaniciAdi = builder.kullaniciAdi;
		this.sifre = builder.sifre;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public boolean kullaniciKontrol() {
		if (db.girisYap(kullaniciAdi, sifre) == true) return true;
		else return false;
	}

	public static class KullaniciBuilder {
		private String kullaniciAdi, sifre;

		public KullaniciBuilder(String kullaniciAdi, String sifre) {
			this.kullaniciAdi = kullaniciAdi;
			this.sifre = sifre;
		}
		public KullaniciBuilder kullanici(String kullaniciAdi) {
			this.kullaniciAdi = kullaniciAdi;
			return this;
			
		}
		public KullaniciBuilder sifre(String sifre) {
			
			this.sifre = sifre;
			return this;
		}

		public Kullanici build() {
			return new Kullanici(this);
		}
	}
}
