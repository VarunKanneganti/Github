import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int rem=0;
        int rev=0;
        for(;n>0;)
        {
            rem=n%10;
            rev=rev * 10 + rem;
            n=n/10;
        }
        System.out.println("Given number is palindrome");
    }
}
