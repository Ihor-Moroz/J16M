package Chapter6;

import java.util.Scanner;

public class PrintCalendar {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int year, month;

        System.out.print("Please enter year as number : ");
        year=input.nextInt();
        System.out.print("Please enter month as number : ");
        month=input.nextInt();

        printMonth(year,month);
    }

    public static void printMonth(int year, int month){
        printMonthTitle(year,month);
        printMonthBody(year,month);
    }
    public static void  printMonthTitle(int year, int month) {
        System.out.println("        "+ getMonthName(month)+ "  "+ year);
        System.out.println("-----------------------------");
        System.out.println(" Mon Tue Wed Thu Fri Sat Sun");
    }


    public static void  printMonthBody(int year, int month) {
        int startDay=getStartDay(year,month);
        int daysOfMonth=getNumberOfDaysInMonth(year,month);

        for (int i=1;i<startDay;i++){
            System.out.print("    ");
        }
        for (int i=1;i<=daysOfMonth;i++){
            System.out.printf("%4d",i);
            if((startDay+i-1)%7==0){
                System.out.println();
            }
        }
    }

    public static String getMonthName(int month){
        String monthName="";
        switch (month){
            case 1: monthName= "January"; break;
            case 2: monthName= "February"; break;
            case 3: monthName= "March"; break;
            case 4: monthName= "April"; break;
            case 5: monthName= "May"; break;
            case 6: monthName= "June"; break;
            case 7: monthName= "July"; break;
            case 8: monthName= "August"; break;
            case 9: monthName= "September"; break;
            case 10: monthName= "October"; break;
            case 11: monthName= "November"; break;
            case 12: monthName= "December"; break;
        }
        return monthName;
    }

    public static int getStartDay(int year, int month){
        final int START_DAY=3;
        return (START_DAY+getTotalNumberOfDays(year,month))%7;
    }

    public static int getTotalNumberOfDays(int year, int month){
        int total=0;
        for (int i=1800;i<year;i++){
            if(isLeapYear(i)){
                total+=366;
            }
            else{
                total+=365;
            }
        }
        for (int i=1;i<month;i++){
            total+=getNumberOfDaysInMonth(year,i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month){
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12 ) {return 31;}
        if(month==4 || month==6 || month==9 || month==11 ) {return 30;}
        if(month==2){return isLeapYear(year)? 29:28;}
        return 0;
    }

    public static boolean isLeapYear(int year){
        return year%400==0 || (year%4==0 && year%100!=0);
    }
}
