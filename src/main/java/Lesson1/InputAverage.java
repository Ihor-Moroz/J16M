package Lesson1;

import java.util.Scanner;

public class InputAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double var1,var2,var3,avrVar;

        System.out.print("Enter three variables: ");
        var1=input.nextDouble();
        var2=input.nextDouble();
        var3=input.nextDouble();

        avrVar=(var1+var2+var3)/3;
        System.out.println("Average is: " + avrVar);

    }
}
