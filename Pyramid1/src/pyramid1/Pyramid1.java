
package pyramid1;

import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args) {
        int i,j,k,l,m;
        Scanner Y = new Scanner(System.in);
        m = Y.nextInt();
        for (i=m;i>=1;i--)
        {
            for (j=1;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    
}
