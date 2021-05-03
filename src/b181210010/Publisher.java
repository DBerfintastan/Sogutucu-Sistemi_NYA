package b181210010;
import java.util.ArrayList;
import java.util.List;

public class Publisher implements ISubject {

      private List<IObserver> takipci = new ArrayList<>();

      public void ekle(IObserver subscriber) {
          takipci.add(subscriber);
      }
       public void cikar(IObserver subscriber) {
           takipci.remove(subscriber);
      }
      public void bildir(String mesaj) {
    	  System.out.println(mesaj);
          for(IObserver takipci: takipci) {
              takipci.guncelle(mesaj);
          }
      }
  }