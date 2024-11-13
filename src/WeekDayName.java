import java.util.Scanner;

public class WeekDayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayName = sc.nextInt();
        if (dayName==1){
            System.out.println("Sunday");
        } else if (dayName==2) {
            System.out.println("Monday");
        }
        else if (dayName==3) {
            System.out.println("Tuesday");
        }
        else if (dayName==4) {
            System.out.println("wednesday");
        }
        else if (dayName==5) {
            System.out.println("Thursday");
        }
        else if (dayName==6) {
            System.out.println("Friday");
        }
        else if (dayName==7) {
            System.out.println("Saturday");
        }
    }
}
