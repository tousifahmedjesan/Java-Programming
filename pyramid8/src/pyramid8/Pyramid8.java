
package pyramid8;

import java.util.Scanner;

public class Pyramid8 {

    public static void main(String[] args) {
       int j,i,k,l,m;
       char  c=65,d;
        Scanner Y = new Scanner(System.in);
        m = Y.nextInt();
        for (i=0;i<m;i++)
        {
            for (j=0;j<=i;j++)
            {
                System.out.print (c);
            }
            System.out.println();
            c++;
        }
    }
    
}
