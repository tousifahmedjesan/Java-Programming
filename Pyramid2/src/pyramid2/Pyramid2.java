
package pyramid2;

import java.util.Scanner;

public class Pyramid2 {

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
            for(j=1; j<=(2*i-1); j++)
                System.out.print("*");
            System.out.print("\n");
        }
    
}
}
