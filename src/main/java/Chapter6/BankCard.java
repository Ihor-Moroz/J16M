package Chapter6;

import java.util.Scanner;

public class BankCard {
    public static void main(String[] args) {
        String cardNumber="";
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter card number: ");
        cardNumber=input.nextLine();
            System.out.println(isValid(cardNumber)? "Valid":"Invalid");
    }

    public static boolean prefixCheck(String number){
        if(number.startsWith("4")||number.startsWith("5")||number.startsWith("37")||number.startsWith("6")) {
            return true;
        }
        else return false;
    }

    public static boolean checkSize(String number){
        if(number.length()>=13&&number.length()<=16) return true;
        else return false;
    }

    public static int sumOfDoubleEvenPlace(String number){
        int sum=0,doubleDigit=0;
        for(int i=number.length()-2;i>=0;i-=2){
            doubleDigit=(((number.charAt(i)-'0')*2)/10)+(((number.charAt(i)-'0')*2)%10);
            sum+=doubleDigit;
        }
        return sum;
    }

    public static int sumOfOddNumbers(String number){
        int sum=0;
        for(int i=number.length()-1;i>=0;i-=2){
            sum+=number.charAt(i)-'0';
        }
        return sum;
    }

    public static boolean isValid(String number){
        if(checkSize(number)&&prefixCheck(number)&&((sumOfOddNumbers(number)+sumOfDoubleEvenPlace(number))%10==0) ) return true;
        else return false;
    }
}
