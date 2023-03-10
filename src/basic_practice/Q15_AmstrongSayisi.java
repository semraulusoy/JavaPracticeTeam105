package basic_practice;

import java.util.Scanner;

public class Q15_AmstrongSayisi {
    // verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code yazin
    // Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
    // 153 = (1*1*1) + (5*5*5) + (3*3*3) gibi
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Amstrong sayisi olup olmadigini kontrol etmek istediginiz bir tam sayi giriniz");
        int kuplerToplami = 0;
        int sayi = scan.nextInt();
        int ilkDeger = sayi;
        int rakam = 0;
        while (sayi != 0) {
            rakam = sayi % 10;
            kuplerToplami += rakam * rakam * rakam;
            sayi /= 10;
        }
        if (kuplerToplami == ilkDeger)
            System.out.println("girdiginiz sayi bir Amstrong sayidir");
         else
            System.out.println("girdiginiz sayi bir Amstrong sayi degildir.");

    }}
