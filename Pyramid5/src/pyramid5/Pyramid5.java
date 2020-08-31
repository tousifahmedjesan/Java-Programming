
package pyramid5;

import java.util.Scanner;

public class Pyramid5 {

    public static void main(String[] args) 
    {
        int i, j, n;

        System.out.print("Enter value of n : ");
        Scanner Y=new Scanner (System.in);
        n = Y.nextInt();

        for(i=1; i<=n; i++)
        {
            for(j=i; j<n; j++)
                System.out.print(" ");
            for(j=1; j<=i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }   
}
