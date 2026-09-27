package pkg1.hafta.odevi.pkg2;
public class JavalHaftaOdevi2 {
    public static void main(String[] args) {
        Stock hisse = new Stock("ORCL", "Oracle Corporation");
        hisse.eskifiyat = 34.5;
        hisse.guncelfiyat = 34.35;
        System.out.println("hisse sembolu: " + hisse.kisaltma);
        System.out.println("hisse adi: " + hisse.adi);
        System.out.println("onceki fiyati: " + hisse.eskifiyat);
        System.out.println("guncel fiyati: " + hisse.guncelfiyat);
        System.out.println("degisim yuzdesi: %" + hisse.getChangePercent());
    }}
class Stock {
    String kisaltma;
    String adi;
    double eskifiyat;
    double guncelfiyat;
    Stock(String yenikisaltma, String yeniad) {
        kisaltma = yenikisaltma;
        adi = yeniad;}
    double getChangePercent() {
        return ((guncelfiyat - eskifiyat) / eskifiyat) * 100;
    }}