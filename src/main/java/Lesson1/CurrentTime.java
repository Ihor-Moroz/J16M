package Lesson1;

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        long currentTime=System.currentTimeMillis();
        long seconds, minutes,hours;
        int GMT;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter GMT: ");
        GMT=input.nextInt();
        seconds=currentTime/1000;
        minutes=seconds/60;
        hours=minutes/60;
        System.out.print((hours%24+GMT)%24);
        System.out.print(":"+ minutes%60);
        System.out.print(":"+ seconds%60);
    }
}
