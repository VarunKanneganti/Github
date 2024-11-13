import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age < 10){
            System.out.println("kids");
        } else if (Age >10 && Age<18) {
            System.out.println("Teenage");
        } else if (Age >=18 && Age <60) {
            System.out.println("Adults");
        } else if (Age >60) {
            System.out.println("Old Age");
        }
    }
}
