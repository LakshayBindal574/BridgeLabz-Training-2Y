package java_fundamentals;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter KM's: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles: " + miles);
        sc.close();
    }
}
