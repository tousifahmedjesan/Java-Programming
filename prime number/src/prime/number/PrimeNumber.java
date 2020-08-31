
package prime.number;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int a, b, c, d,e;
        Scanner y =new Scanner(System.in);
        a = y.nextInt();
        for (b=2;b<=a;b++)
        {
            e = 0;
            for (c=2;c<b;c++)
                if (b%c==0)
                {
                    e = 1;
                    break;
                }
            if (e == 0)
                System.out.print("  "+b);
        }
    }
    
}
