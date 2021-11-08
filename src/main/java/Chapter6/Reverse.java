package Chapter6;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String number="";
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        number=input.nextLine();
        System.out.print("Reverse number is " + reverse(number)+ " and it`s");
        System.out.println(isPalindrome(number)? " palidrome":" not palidrome");
    }
    public static String reverse(String number){
        String reverse="";
        for (int i=number.length()-1;i>=0;i--){
            reverse+=number.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindrome(String number){
        if (number.equals(reverse(number))){
            return true;
        }
        else {
            return false;
        }
    }
}

