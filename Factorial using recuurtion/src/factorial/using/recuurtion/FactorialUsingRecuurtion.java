
package factorial.using.recuurtion;

import java.util.Scanner;

public class FactorialUsingRecuurtion {
    
    static int factorial (int n){
        if (n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }

    public static void main(String[] args) {
        int i, f , m;
        System.out.println("Enter a number to cheak it's factorial : ");
        Scanner y = new Scanner (System.in);
        m = y.nextInt();
        f = factorial (m);
        System.out.println("Factorial of "+m+" is : "+f);
        
    }
    
}
