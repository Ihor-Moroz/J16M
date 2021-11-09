package Chapter6;

public class TwinPrimes {
    public static void main(String[] args) {
        int digits=0;
        int lastPrime=1;

        for(int i=1;digits<1200;i++){
            if (isPrime(i)){
                    if(checkForDifferTwo(i,lastPrime)){
                        System.out.println("("+lastPrime+", "+ i+")");
                        digits++;
                        }
                lastPrime=i;
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

    public static boolean checkForDifferTwo(int current, int last){
        return (current-last==2)? true:false;
    }
}
