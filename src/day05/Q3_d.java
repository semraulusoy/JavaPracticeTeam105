package day05;

public class Q3_d {
    public static void main(String[] args) {
        /*
         * Interview questions…
         *
         * write a return method to reverse number
         *
         * Input : 12345 Output : 54321
         */


        int input=12345;
        ReverseNumber(12345);


    }
    public static void ReverseNumber(int input) {
        int ReverseNumber = 0;

        while (input > 0) {
            ReverseNumber = input % 10 + ReverseNumber * 10;
            input /= 10;
        }

        System.out.println(ReverseNumber);


    }


    }


