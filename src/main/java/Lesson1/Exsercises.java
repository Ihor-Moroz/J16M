package Lesson1;

import java.util.Scanner;

public class Exsercises {
    public static void main(String[] args) {
        int var,sotni,desatki,odinitsy;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        var=input.nextInt();

        sotni= var/100;
        desatki=(var-sotni*100)/10;
        odinitsy=(var - sotni*100 - desatki*10);
        System.out.println("Multiplication of the numbers "+ var + " is "+ sotni*desatki*odinitsy);
    }
}
