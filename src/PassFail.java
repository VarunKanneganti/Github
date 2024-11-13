import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int Marks = src.nextInt();
        if (Marks<20){
            System.out.println("You have Failed");
        }
        else {
            System.out.println("You have Passed!!");
        }
    }
}
