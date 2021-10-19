package Chapter3;

import java.util.Scanner;

public class MonopollyCasino  {
    public static void main(String[] args) {
        /*
        v1 бантик
        v2 дзвіночок
        v3 вишенька
        v4 кекс
        v5 сердечко
        v6 топор
         */
        int bet,enteredNumberD1,enteredNumberD2,enteredNumberD3,v1=1,v2=2,v3=3,v4=4,v5=5,v6=6;
        Scanner input= new Scanner(System.in);

        System.out.print("Please enter your bet: ");
        bet=input.nextInt();
        enteredNumberD1=1+(int)(Math.random()*6);
        enteredNumberD2=1+(int)(Math.random()*6);
        enteredNumberD3=1+(int)(Math.random()*6);

        if ((enteredNumberD1==1)&&(enteredNumberD2==1)&&(enteredNumberD3==1)){//якщо всі бантики
            System.out.println("You won " + bet*10);
        }
        else if((enteredNumberD1==v2)&&(enteredNumberD2==v2)&&(enteredNumberD3==v2)){//якщо всі дзвіночки
            System.out.println("You won " + bet*20);
        }
        else if((enteredNumberD1==v3)&&(enteredNumberD2==v3)&&(enteredNumberD3==v3)){//якщо всі вишеньки
            System.out.println("You won " + bet*30);
        }
        else if((enteredNumberD1==v4)&&(enteredNumberD2==v4)&&(enteredNumberD3==v4)){//якщо всі кекси
            System.out.println("You won " + bet*40);
        }
        else if((enteredNumberD1==v5)&&(enteredNumberD2==v5)&&(enteredNumberD3==v5)){//якщо всі сердечка
            System.out.println("You won " + bet*50);
        }
        else if((enteredNumberD1==v6)&&(enteredNumberD2==v6)&&(enteredNumberD3==v6)){//якщо всі топорики
            System.out.println("You won " + bet*100);
        }
        else if((enteredNumberD1==v1)&&(enteredNumberD2==v1)||(enteredNumberD1==v1)&&(enteredNumberD3==v1)||(enteredNumberD2==v1)&&(enteredNumberD3==v1)){//якщо 2 бантики
            System.out.println("You won " + bet);
        }
        else if((enteredNumberD1==v2)&&(enteredNumberD2==v2)||(enteredNumberD1==v2)&&(enteredNumberD3==v2)||(enteredNumberD2==v2)&&(enteredNumberD3==v2)){//якщо 2 дзвіночки
            System.out.println("You won " + bet*2);
        }
        else if((enteredNumberD1==v3)&&(enteredNumberD2==v3)||(enteredNumberD1==v3)&&(enteredNumberD3==v3)||(enteredNumberD2==v3)&&(enteredNumberD3==v3)){//якщо 2 вишеньки
            System.out.println("You won " + bet*2);
        }
        else if((enteredNumberD1==v4)&&(enteredNumberD2==v4)||(enteredNumberD1==v4)&&(enteredNumberD3==v4)||(enteredNumberD2==v4)&&(enteredNumberD3==v4)){//якщо 2 кекси
            System.out.println("You won " + bet*3);
        }
        else if((enteredNumberD1==v5)&&(enteredNumberD2==v5)||(enteredNumberD1==v5)&&(enteredNumberD3==v5)||(enteredNumberD2==v5)&&(enteredNumberD3==v5)){//якщо 2 сердечка
            System.out.println("You won " + bet*3);
        }
        else if((enteredNumberD1==v6)&&(enteredNumberD2==v6)||(enteredNumberD1==v6)&&(enteredNumberD3==v6)||(enteredNumberD2==v6)&&(enteredNumberD3==v6)){//якщо 2 топорики
            System.out.println("You won " + bet*5);
        }
        else {
            System.out.println("You`re a loser");
        }

        System.out.println("Win number "+ enteredNumberD1 + ""+enteredNumberD2+""+enteredNumberD3);
    }
}
