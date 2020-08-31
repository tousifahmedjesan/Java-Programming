
package sum.pkg1.pkg2.pkg4.pkg7;

import java.util.Scanner;

public class Sum1247 {

    public static void main(String[] args) {
        int i,j=1,k=0,n;
        System.out.println ("Enter the value of n: ");
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        for (i=1;j<=n;i++)
        {
            k=k+j;
            j=j+i;
        }
        System.out.println ("The sum is : "+k);
    }
}
