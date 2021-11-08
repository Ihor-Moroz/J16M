package Chapter6;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password="";
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the password: ");
        password=input.nextLine();
        System.out.println(checkPassword(password)?"Valid Password":"Invalid password");
    }
    public static boolean checkPassword(String password){
        if(checkTenCharacters(password)&&checkConsistOfOnlyLettersAndDigits(password)&&checkThreeDigits(password)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkTenCharacters(String password){
        if(password.length()>=10) {
            return  true;
        }
        else{
            return false;
        }
    }
    public static boolean checkConsistOfOnlyLettersAndDigits(String password){
        boolean symbolDetected=false;
        for (int i=0;i<=password.length()-1;i++)
        {
            if(!((password.charAt(i)>='a'&&password.charAt(i)<='z')||(password.charAt(i)>='A'&&password.charAt(i)<='Z')||(password.charAt(i)>='0'&&password.charAt(i)<='9'))){
                symbolDetected=true;
            }
        }
        return !symbolDetected;
    }
    public static boolean checkThreeDigits(String password){
        int digits=0;
        for (int i=0;i<=password.length()-1;i++){
            if(password.charAt(i)>='0'&&password.charAt(i)<='9'){
                digits++;
            }
        }
        if(digits>=3){
            return true;
        }
        else return false;
    }
}
