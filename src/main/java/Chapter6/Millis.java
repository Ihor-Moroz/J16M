package Chapter6;

import java.util.Scanner;

public class Millis {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long millis=0;
        System.out.print("Please enter millis: ");
        millis=input.nextLong();
        System.out.println(convertMills(millis));
    }
    public static String convertMills(long millis)
    {
        String converted="";
        long hours,minutes,seconds;
        seconds=millis/1000;
        minutes=seconds/60;
        seconds%=60;
        hours=minutes/60;
        minutes%=60;
        return hours+ ":"+ minutes + ":"+seconds;
    }
}
