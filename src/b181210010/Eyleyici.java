package b181210010;

import java.util.Scanner;

public class Eyleyici implements IEyleyici {
	
	private boolean sogutucuDurum;
	public Eyleyici(boolean sogutucuDurum) {
		this.sogutucuDurum = sogutucuDurum;

	}

	public boolean isSogutucuDurum() {
		return sogutucuDurum;
	}

	public void setSogutucuDurum(boolean sogutucuDurum) {
		this.sogutucuDurum = sogutucuDurum;
	}

	public void sogutucuAc() {
		sogutucuDurum = true;
		System.out.println("Sogutucu Acildi");
	}

	public void sogutucuKapat() {
		sogutucuDurum = false;
		System.out.println("Sogutucu Kapatildi");
	}

}
