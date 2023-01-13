package basic_practice;

public class Q13_Carpimtablosu {
    public static void main(String[] args) {

    int input=12;
    CarpimTablosu(input);
}
private static void CarpimTablosu(int input){
    for (int i = 1; i <= input; i++) {
        for (int j = 1; j <=input ; j++) {
            System.out.printf("%5d",i*j);
        }
        System.out.println();
    }

}}