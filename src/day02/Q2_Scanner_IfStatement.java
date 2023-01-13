package day02;

import java.util.Scanner;

public class Q2_Scanner_IfStatement {
    public static void main(String[] args) {


        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama hesaplandiktan sonra dersten gecilip
    gecilmedigini consola yazdiran bir program yazalim.
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

//herhangi bir variablein altina soutv yaparsaniz otomatik yapar.
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen vize notunuzu giriniz");

        double vize= scan.nextDouble();
        System.out.println("vize = " + vize);
        System.out.println("lutfen final notunuzu giriniz");


        double Final=scan.nextDouble();

        System.out.println("lutfen devam notunu giriniz");

        double devamNotu=scan.nextDouble();

        double ortalama=(vize*0.1)+(Final*0.8)+(devamNotu*0.1)/3;
        System.out.println(((vize*0.1)+(Final*0.8)+(devamNotu*0.1))+"ortalama");

        if (ortalama>=70){
            System.out.println("gectiniz");
        }else if (ortalama>=60)
            {System.out.println("sartli gectiniz");
        }else {
            System.out.println("kaldiniz");

        }




    }
}
//kondition ile kodunuz ayni satirda yazilacaksa suslu parantez kullanilmasa da hata vermez.
//(ortalama>=60)System.out.println("sartli gectiniz");
//suslu paranteze iki kere tiklarsak parantezin icini gosterir.