package Chapter6;

public class PalindromicReverse {

    public static void main(String[] args) {
        int digits=0;
        System.out.println("Test");
        for(int i=1;digits<120;i++){
            if(!checkForPalindromic(i, reverse(i))&&isPrime(i)&&isPrime(reverse(i))){
                System.out.print(i+ " ");
                digits++;
                if(digits%10==0) System.out.println();
            }
        }
    }

    public static boolean isPrime(int number){
        int numberOfDividors=0;
        for (int i=1;i<=number&&numberOfDividors<=2;i++){
            if(number%i==0) numberOfDividors++;
        }
        if(numberOfDividors==2) return true;
        else return false;
    }
    public static int reverse(int number)
    {
        String numberAsString=""+number;
        String reverse="";
        for (int i=numberAsString.length()-1;i>=0;i--){
            reverse+=numberAsString.charAt(i);
        }
        return Integer.parseInt(reverse);
    }

    public static boolean checkForPalindromic(int original, int reverse) {
        return (original==reverse)? true:false;
    }
}
