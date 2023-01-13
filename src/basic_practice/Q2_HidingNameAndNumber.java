package basic_practice;

import java.util.Scanner;

public class Q2_HidingNameAndNumber {
    public static void main(String[] args) {

        /*
         * Ask user Name, Surname and credit card numbers than convert it to special
         * form
         *
         * (Check credit card number, if there aren't 16 digit print
         * "Invalid credit card number"
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         *
         *
*/

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ismminizi giriniz");

       String  isim=scan.nextLine();
    }
}
