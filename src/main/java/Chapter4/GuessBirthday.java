package Chapter4;

import java.util.Scanner;

public class GuessBirthday {
    public static void main(String[] args) {
        String set[]=new String[5];
        set[0]="1  3  5  7\n"+" 9  11  13  15\n"+" 17  19  21  23\n"+" 25  27  29  31\n";
        set[1]="2  3  6  7\n"+" 10  11  14  15\n"+" 18  19  22  23\n"+" 26  27  30  31\n";
        set[2]="4  5  6  7\n"+" 12  13  14  15\n"+" 20  21  22  23\n"+" 28  29  30  31\n";
        set[3]="8  9  10  11\n"+" 12  13  14  15\n"+" 24  25  26  27\n"+" 28  29  30  31\n";
        set[4]="16  17  18  19\n"+" 20  21  22  23\n"+" 24  25  26  27\n"+" 28  29  30  31\n";

        int day=0,answer=0;
        Scanner input = new Scanner(System.in);
        for (int i=0;i< set.length;i++){
            System.out.println("Is your birthday in this set?\n" + set[i]);
            System.out.println("Enter 0 for No and 1 for Yes: ");
            answer=input.nextInt();
            if (answer==1){
                day+=Integer.parseInt(set[i].substring(0,set[i].indexOf(" ")));
            }
        }
        System.out.println("Birthday is " + day);

    }
}
