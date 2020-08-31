
package fibonacci;

import java.util.Scanner;

public class FIBONACCI {

    public static void main(String[] args) 
    {
      int n,a=0,b=1,c,x;
        Scanner t = new Scanner (System.in);
        n = t.nextInt();
        for (x=0; x<n; x++)
        {
            if (x<=1)
                c=x;

            else
            {
                c=a+b;
                a=b;
                b=c;
            }
            System.out.print("  "+c);
        }
    }
    
}
