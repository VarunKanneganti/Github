import java.util.Scanner;

public class WeatherCondition {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int Temp = src.nextInt();
        if (Temp < 0){
            System.out.println(" Freezing weather");
        } else if (Temp >0 && Temp<10) {
            System.out.println("Very Cold Weather");
        } else if (Temp > 10 && Temp <20) {
            System.out.println("cold Weather");
        } else if (Temp >20 && Temp<30) {
            System.out.println("Normal Weather");
        } else if (Temp >30 && Temp <40) {
            System.out.println("Hot Weather");
        } else if (Temp >=40) {
            System.out.println("Very Hot Weather");
        }
    }
}
