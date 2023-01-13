package basic_practice;

import java.util.Scanner;

public class Q12_Karekok {
    public static void main(String[] args) {
double sayi=9;

        //Kullanicidan aldiginiz sayinin karekokunu hesaplayan bir program yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println();
        double karekok=1.0;
        for (double i = 1; i*i <=sayi ; i+=0.001) {
            karekok=i;

        }

        System.out.printf("%3f",karekok);

    }


}
