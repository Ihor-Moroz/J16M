package Chapter3;

import java.util.Scanner;

public class LotteryV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredNumber, winNumber,enteredNumberD1,enteredNumberD2,enteredNumberD3,winNumberD1,winNumberD2,winNumberD3;
        winNumber= (int)(Math.random()*1000);

        System.out.print("Enter the number(three digits)  " );
        enteredNumber= input.nextInt();

        enteredNumberD1=enteredNumber/100;
        enteredNumberD2=(enteredNumber/10)%10;
        enteredNumberD3=enteredNumber%10;

        winNumberD1=winNumber/100;
        winNumberD2=(winNumber/10)%10;
        winNumberD3=winNumber%10;

        if (enteredNumber==winNumber){
            System.out.println("Your won 12000$ ");
        }
        else if(((enteredNumberD1==winNumberD1)&&(enteredNumberD2==winNumberD3)&&(enteredNumberD3==winNumberD2))||((enteredNumberD2==winNumberD2)&&(enteredNumberD3==winNumberD1)&&(enteredNumberD3==winNumberD1))||((enteredNumberD3==winNumberD3)&&(enteredNumberD2==winNumberD1)&&(enteredNumberD1==winNumberD2))||((enteredNumberD1==winNumberD2)&&(enteredNumberD2==winNumberD3)&&(enteredNumberD3==winNumberD1))||((enteredNumberD1==winNumberD3)&&(enteredNumberD2==winNumberD1)&&(enteredNumberD3==winNumberD2))){
            System.out.println("You won 5000$");
        }
        else if((enteredNumberD1==winNumberD1)||(enteredNumberD1==winNumberD2)||(enteredNumberD1==winNumberD3)||(enteredNumberD2==winNumberD1)||(enteredNumberD2==winNumberD2)||(enteredNumberD2==winNumberD3)||(enteredNumberD3==winNumberD1)||(enteredNumberD3==winNumberD2)||(enteredNumberD3==winNumberD3)){
            System.out.println("You won 2000$");
        }
        else {
            System.out.println("You lost");
        }
    }
}
