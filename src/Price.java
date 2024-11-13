import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        float price1 = 0.30f;
        float price2 = 0.28f;
        float  price3 = 0.27f;
        float price4 = 0.26f;
        Scanner scr = new Scanner(System.in);
        int Copies = scr.nextInt();
        if (Copies > 0 && Copies <=99){
            System.out.println("Total Price per copy");
            System.out.println((price1*Copies));
        } else if (Copies > 100 && Copies <=499) {
            System.out.println("Total Price per copy");
            System.out.println((price2*Copies));
        } else if (Copies > 500 && Copies <=799) {
            System.out.println("Total Price per copy");
            System.out.println((price3*Copies));
        } else if (Copies > 800 && Copies <=1000) {
            System.out.println("Total Price per copy");
            System.out.println((price4*Copies));
        }

    }
}
