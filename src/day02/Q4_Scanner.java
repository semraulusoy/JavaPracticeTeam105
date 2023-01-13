package day02;

import java.util.Scanner;

public class Q4_Scanner {
    public static void main(String[] args) {


        {

                /* Write a Java program that asks to user 2 questions Question
                 * 1 = how many tea do you drink in a day? Question
                 * 2 = how many sugar do you use for a glass of tea?
                 *
                 * Calculate how many sugar does user use as kilogram in a year and in 40 years
                 * then print it on the console
                 * If user doesn't use sugar print "Good Job, less sugar more health"
                 *
                 * (Hint 1 sugar = 2.7 gr)
                 */
    /*
         Kullaniciya
         * 1 = Gunde kac bardak cay ictigini,
         * 2 = Her bardak icin kac kup seker kullandigini sorup;
         kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda  consolda yazdiran bir program yazin.
         * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
          (1 kup seker = 2.77 gr)
    */
                Scanner scan= new Scanner(System.in);
                System.out.println("Please enter how many glasses of tea you drink");
                int number1= scan.nextInt();

                Scanner sugar= new Scanner(System.in);
                System.out.println("Please enter how many sugars you put in a glass of tea.");
                int number2= scan.nextInt();

                //sugarConsumed
                System.out.println("sugarConsumed for a year: " +number1 * number2 * 365 * (2.77 / 1000));
                System.out.println("sugarConsumed for 40 year: " +40 * number1 * number2 * 365 * (2.77 / 1000));

            }
        }
    }

