import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i>0)
        {
            System.out.println("+ve Number");
        }
        else if (i<0)
        {
            System.out.println("-ve Number");
        } else if (i==0) {
            System.out.println("zero");
        }
    }
}
