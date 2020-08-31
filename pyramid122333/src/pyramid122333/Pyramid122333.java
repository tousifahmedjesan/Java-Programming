
package pyramid122333;

import java.util.Scanner;

public class Pyramid122333 {

    public static void main(String[] args) {
       int i, j, n;
       Scanner y = new Scanner(System.in);
       n = y.nextInt();
       for (i=1;i<n;i++){
           for (j=1; j<=i; j++)
               System.out.print(i);
           System.out.println();
       }
    }
    
}
