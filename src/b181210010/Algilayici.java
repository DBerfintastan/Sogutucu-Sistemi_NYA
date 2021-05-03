package b181210010;

import java.util.Random;

public class Algilayici implements IAlgilayici {

	private int sicaklik;
	public Algilayici(int sicaklik) {
		super();
		this.sicaklik = sicaklik;
	}

	public int getSicaklik() {

		return sicaklik;
	}

	public void setSicaklik(int sicaklik) {
		this.sicaklik = sicaklik;
	}

	public void sicaklikOlc() {
		ISubject publisher=new Publisher();
		IEyleyici eyleyici=new Eyleyici(false);
		Random rand = new Random();
		sicaklik = rand.nextInt(60);
		System.out.println("Sistemin anlik sicakligi: "+sicaklik+ "°C");
		if(sicaklik>40)
		{
			publisher.bildir("Sistem kritik sicaklikta..");
			eyleyici.sogutucuAc();
			
		}
	}

	
}
