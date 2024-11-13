import java.util.Scanner;

public class SimpleInterestCompound {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int P = scr.nextInt();
        int t = scr.nextInt();
        int R = scr.nextInt();
        int val=(int)(1+R/100);
        int SI =(P*t*R/100);
        System.out.println(P*Math.pow(val , t));
        System.out.println(SI);


    }
}
