
package number.pyramid;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        int i,j,k,l,m;
        Scanner Y = new Scanner(System.in);
        m = Y.nextInt();
        for (i=1;i<=m;i++)
        {
            for (j=1;j<=i;j++)
                System.out.print(""+j);
            System.out.print("\n");
        }
    }    
}
