//import java.util.Scanner;
//
//public class LeapYearOrNot {
//    public static void main(String[] args) {
//        Scanner src = new Scanner(System.in);
//        int Year = src.nextInt();
//        if ((Year % 4) ==0){
//            System.out.println("This is leap year");
//        }
//        else {
//            System.out.println("Not a Leap Year");
//        }
//    }
//}








//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//
//public class LeapYearOrNot {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        boolean leap = false;
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    leap = true;
//                } else {
//                    leap = false;
//                }
//            } else {
//                leap = true;
//            }
//        } else {
//            leap = false;
//        }
//
//        if (leap) {
//            System.out.println(year + " is a leap year");
//        } else {
//            System.out.println(year + " is not a leap year");
//        }
//    }
//}
//


import java.io.*;
import java.util.*;

public class  LeapYearOrNot{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0;
        int sum=0;
        for (;n>0;){
            rem = n%10;
            sum = sum+rem;
            n = n/10;

        }

    }
}