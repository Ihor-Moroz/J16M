package Lesson1;

import java.util.Scanner;

public class SecondsToYears {
    public static void main(String[] args) {
        int seconds,minutes,hours,days,weeks,check;
        int remainingSeconds,remainingMinutes,remainingHours,remainingDays;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter seconds: ");
        seconds=input.nextInt();

        remainingSeconds=seconds%60;

        minutes=seconds/60;
        remainingMinutes=minutes%60;

        hours=minutes/60;
        remainingHours=hours%24;

        days=hours/24;
        remainingDays=days%7;

        weeks=days/7;

        System.out.print(seconds + " it`s ");
        System.out.println(weeks +" weeks " + remainingDays +" days " + remainingHours +" hours " + remainingMinutes+" minutes " +remainingSeconds + " seconds");
        check=weeks*7*24*60*60 + remainingDays*24*60*60 + remainingHours*60*60 + remainingMinutes*60 + remainingSeconds;
        System.out.println("Check seconds value "+ check);
    }
}
