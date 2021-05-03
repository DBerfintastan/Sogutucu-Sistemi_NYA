package b181210010;

public interface ISubject {

    void ekle(IObserver observer);
    void cikar(IObserver observer);
    void bildir(String mesaj);

}