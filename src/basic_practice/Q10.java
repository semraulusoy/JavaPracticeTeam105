package basic_practice;

import java.util.Scanner;

public class Q10 {

    //kullanicidan 3 harften uzun bir kelime ve 10 dan kucuk bir sayi aliniz
    // kelimenin son 2 harfi girilen sayi kadar yanyana yazdiran bir program yaziniz
    //orn: input:mustafa sayi=3 output: fafafa

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= scan.next();
        System.out.println("10 dan kucuk bir tamsayi giriniz ");
        int sayi=scan.nextInt();
        String son2harf=kelime.substring((kelime.length()-2));
        //System.out.println(son2harf.repeat(sayi));

        for (int i = 0; i <sayi; i++) {
            System.out.println(son2harf);

        }
    }
}
