package Chapter6;

import java.util.Scanner;

public class GuessCardNumber {
    public static void main(String[] args) {
        int indexOfMissingNumber=0;// missing like *
        int correctMissingNumber=-1;
        String cardNumber="";
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter card number: ");
        cardNumber=input.nextLine();
        indexOfMissingNumber=findMissing(cardNumber);
        correctMissingNumber=getValidNumber(cardNumber,indexOfMissingNumber);
        System.out.println("Correct card number is: "+ replaceNumberWithMissingIndex(cardNumber,indexOfMissingNumber,correctMissingNumber)+ " the number "+ correctMissingNumber + " missed");

    }

    public static int getValidNumber(String number, int indexOfMissingNumber){
        int missingNumber=-1;
        for (int i=0;i<10;i++){
            if(isValid(replaceNumberWithMissingIndex(number,indexOfMissingNumber,i))){
                missingNumber=i;
            }
        }
        return missingNumber;
    }

    public static String replaceNumberWithMissingIndex(String number, int index, int newNumber){
        String subNumber1="",subNumber2="",finalNumber="";
        subNumber1=number.substring(0,index);
        subNumber2=number.substring(index+1, number.length());
        finalNumber=subNumber1+newNumber+subNumber2;
        return finalNumber;
    }

    public static int findMissing(String number){
        int missingIndex=0;
        missingIndex=number.indexOf("*");
        return missingIndex;
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
