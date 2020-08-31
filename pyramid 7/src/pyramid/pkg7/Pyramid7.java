
package pyramid.pkg7;

import java.util.Scanner;

public class Pyramid7 {
    public static void main(String[] args) {
       int i,j,k,l,m;
       char c;
        Scanner Y = new Scanner(System.in);
        m = Y.nextInt();
        for (i=0;i<m;i++)
        {
            for (c=(char) (65+i);c<=65+(2*i);c++)
            {
                System.out.print (c);
            }
            System.out.print("\n");
        }
    }
    
}
