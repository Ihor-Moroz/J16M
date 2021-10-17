package Chapter3;

public class RandomMonth {
    public static void main(String[] args) {
        int randomMonth;
        for(int i=0;i<100;i++){
            randomMonth=(int)(Math.random()*10) + ((Math.random()>0.5) ? 1 : 0)+((Math.random()>0.5) ? 1 : 0);
            System.out.println(randomMonth);
        }
    }
}
