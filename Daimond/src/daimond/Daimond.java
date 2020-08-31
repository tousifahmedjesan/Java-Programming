
package daimond;

import java.util.Scanner;

public class Daimond {

    public static void main(String[] args) {
      int i, j, n;

        System.out.print("Enter value of n : ");
        Scanner Y=new Scanner (System.in);
        n = Y.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=i; j<n; j++)
                System.out.print(" ");
            for(j=1; j<=(2*i-1); j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for(i=n; i>=1; i--)
        {
            for(j=i; j<=n; j++)
                System.out.print(" ");
            for(j=2; j<(2*i-1); j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }   
}
