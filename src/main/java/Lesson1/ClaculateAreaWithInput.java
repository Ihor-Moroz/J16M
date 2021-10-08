package Lesson1;

import java.util.Scanner;

public class ClaculateAreaWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        double area = radius*radius*3.14159;
        System.out.println("The area for the circle of the radius "+ radius + " is " +area);
    }
}
