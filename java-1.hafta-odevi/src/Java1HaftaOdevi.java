
public class Java1HaftaOdevi {
    public static void main(String[] args) {
    Rectangle test1 = new Rectangle(4.0, 40.0);
    System.out.println("genislik: " + test1.genislik);
    System.out.println("yukseklik: " + test1.yukseklik);
    System.out.println("alan: " + test1.getArea());
    System.out.println("cevre: " + test1.getPerimeter());
       Rectangle test2 = new Rectangle(3.5, 35.9);
    System.out.println("genislik: " + test2.genislik);
    System.out.println("yukseklik: " + test2.yukseklik);
    System.out.println("alan: " + test2.getArea());
    System.out.println("cevre: " + test2.getPerimeter());}}
class Rectangle {
    double genislik;
    double yukseklik;
    Rectangle() {
        genislik = 1.0;
        yukseklik = 1.0;}
    Rectangle(double yeniGenislik, double yeniYukseklik) {
        genislik = yeniGenislik;
        yukseklik = yeniYukseklik;}
    double getArea() {
        return genislik * yukseklik;}
    double getPerimeter() {
        return 2 * (genislik + yukseklik);}}