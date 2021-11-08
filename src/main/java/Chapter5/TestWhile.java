package Chapter5;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {
        int number, max;
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        max=number;

        do {
            number=input.nextInt();
            max=(number>max)?number:max;
        }while(number!=0);
        System.out.println(max);
        System.out.println(number);
    }
}
