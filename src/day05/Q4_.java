package day05;

public class Q4_ {

    //Bir top belirli yükseklikten atılmaktadır.
    // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    public static void main(String[] args) {
        double yukseklik=200;
        double alinantoplamyol=0;
        int yerevurmasayisi=0;

        do { yerevurmasayisi++;
            alinantoplamyol += yukseklik;
                    yukseklik*= 0.75;
                    alinantoplamyol+=yukseklik;



        }while(yukseklik>=100);

        System.out.println("Topun yere vurma sayisi"+yerevurmasayisi+
               "\nalinan yol toplami"+alinantoplamyol);


}}