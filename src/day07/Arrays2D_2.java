package day07;

public class Arrays2D_2 {

    public static void main(String[] args) {

        String[][] food = {{"steak", "hot dog", "cheeseburger"}, {"pizza", "pasta", "canoli"},
                {"sushi", "ramen", "fried rice", "dumplings"}, {"kebab", "manto"},
                {"beriyani", "masal", "curry", "chicken tikka masala"}};

        for (String[] ulkeler : food) {

            for (String yemek: ulkeler) {

                System.out.println(yemek);

            }
            System.out.println("-----------------------");
        }

        System.out.println("====================== For i Cozumu =====================");

        String[] country = {"american","italian","asian"," afghani","indian"};

        for (int i = 0; i < food.length; i++) {

            System.out.println("----------------- " + country[i] + " --------------------");

            for (int j = 0; j < food[i].length; j++) {
                System.out.println(food[i][j]);
            }
        }
    }
}
