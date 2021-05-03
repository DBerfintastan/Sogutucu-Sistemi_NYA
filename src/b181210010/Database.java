package b181210010;

import java.sql.*;

public class Database {

	public static Connection baglan() {
		Connection baglanti = null;
		try {
			baglanti = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullanici", "postgres", "123456");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return baglanti;
	}

	public boolean girisYap(String kullaniciAdi, String sifre) {
		Connection baglanti = baglan();
		String sorgu = "SELECT *  FROM \"kullanicibilgi\" WHERE \"kullaniciadi\"='" + kullaniciAdi + "' and \"sifre\"='"
				+ sifre + "'";
		if (baglanti != null) {
			try {
				Statement st = baglanti.createStatement();
				ResultSet rs = st.executeQuery(sorgu);
				baglanti.close();
				if (rs.next())
					return true;
				else
					return false;

			} catch (Exception e) {
				// TODO: handle exception
			}
		} else
			return false;
		return false;
	}
}