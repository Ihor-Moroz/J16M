package Chapter3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredNumber, winNumber;
        winNumber= (int)(Math.random()*100);

        System.out.print("Enter the number(two digits)  " );
        enteredNumber= input.nextInt();
        if (enteredNumber==winNumber){
            System.out.println("Your won 10000$ ");
        }
        else if ((enteredNumber/10==winNumber%10)&&(enteredNumber%10==winNumber/10)) {
            System.out.println("You won 3000$");
        }
        else if((enteredNumber/10 == winNumber/10)||(enteredNumber%10 == winNumber%10)||(enteredNumber%10 == winNumber/10)||(enteredNumber/10 == winNumber%10)) {
            System.out.println("You won 1000$");
        }
        else {
            System.out.println("You lost");
        }
        System.out.println("Your number is " + enteredNumber + " Win is " + winNumber);

    }
}
