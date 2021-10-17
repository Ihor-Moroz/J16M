package Chapter3;

import java.util.Scanner;

public class ISBN_Checksum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enteredNumber,d1,d2,d3,d4,d5,d6,d7,d8,d9,checkSum;
        System.out.print("Please enter 9 digit number ");
        enteredNumber=input.nextInt();
        d9=enteredNumber%10;
        d8=(enteredNumber/10)%10;
        d7=(enteredNumber/100)%10;
        d6=(enteredNumber/1000)%10;
        d5=(enteredNumber/10000)%10;
        d4=(enteredNumber/100000)%10;
        d3=(enteredNumber/1000000)%10;
        d2=(enteredNumber/10000000)%10;
        d1=(enteredNumber/100000000)%10;
        checkSum=(d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
        if (checkSum==10){
            System.out.println("ISBN "+ d1+d2+d3+d4+d5+d6+d7+d8+d9 + "X");
        }
        else{
            System.out.println("ISBN "+ d1+d2+d3+d4+d5+d6+d7+d8+d9+checkSum);
        }
    }
}
