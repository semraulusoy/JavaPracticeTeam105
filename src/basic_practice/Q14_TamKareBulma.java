package basic_practice;

import java.util.Scanner;

public class Q14_TamKareBulma {
    /*
       Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       tamkare ise true  değilse false yazdırınız.
        Not: sqrt gibi fonksiyonları  kullanmayın.
        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16
        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25
        Example 3:
        Input: 14
        Output: false
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int count=1;
        int sayi=scan.nextInt();
        boolean a=false;

        while(count*count<=sayi) {
            count++;
            if (count * count == sayi) {
                a = true;
                System.out.println(a);
            }
            count++;
        }
         if (!a) System.out.println(a);
            }
        }






