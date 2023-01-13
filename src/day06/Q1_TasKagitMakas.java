package day06;

import java.util.Random;
import java.util.Scanner;

public class Q1_TasKagitMakas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int compChoice = 0;
        int user = 0;
        int comp = 0;
        //herhangi birsarta bakmaksizin oyunu baslatacagiz o yuzden do while dongusu kullanmak gerekir.


        do {
            System.out.println("Please make your choice: \n\t1 for Rock \n\t2 for paper \n\t3 for scissors ");
            userChoice= scan.nextInt();
            compChoice=random.nextInt(3)+1;

            if(userChoice==1&&compChoice==2){
                System.out.println("paper wraps Rock=====>Computer=+1");
                comp++;
                System.out.println("User= "+user +"|Computer+1"+comp);

            } else if (userChoice==1&& compChoice==3){
                System.out.println("Rock smash Scissors=====>User+1");
                user++;
                System.out.println("User= "+user +"|Computer+1"+comp);

            } else if(userChoice==2&&compChoice==1){
                System.out.println("paper wraps Rock=====>Computer=1");
                user++;
                System.out.println("User= "+user +"|Computer+1"+comp);

            } else if(userChoice==2&&compChoice==3){
                System.out.println("Scissors cuts paper=====>Computer=1");
                comp++;
                System.out.println("User= "+user +"|Computer+1"+comp);


            } else if(userChoice==3&&compChoice==2){
                System.out.println("Scissors cuts paper=====>Computer=1");
               user++;
                System.out.println("User= "+user +"|Computer+1"+comp);


            } else if(userChoice==3&&compChoice==1){
                System.out.println("Rock smash Scissors=====>Computer=1");
                comp++;
                System.out.println("User= "+user +"|Computer+1"+comp);

            }else System.out.println("it is a tie");
            System.out.println("User= "+user +"|Computer+1"+comp);


            }
        while (user != 5 && comp != 5); {

            if(user>comp) System.out.println("you arethe winner");
            else System.out.println("sorry you are loser :(''");


        }
    }}
