
package reverse.number;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        int a, b, c, r=0;
        Scanner Y = new Scanner(System.in);
        a = Y.nextInt();
        while (a!=0)
        {
             b=a%10;
             r = r*10+b;
             a/=10;
        }
        System.out.println(r);
    }
}