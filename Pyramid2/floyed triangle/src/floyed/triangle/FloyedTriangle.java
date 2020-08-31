package floyed.triangle;
import java.util.Scanner;
public class FloyedTriangle {
    public static void main(String[] args) {
        int n, i, j, k=1;
        Scanner Y=new Scanner (System.in);
        n = Y.nextInt();
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out .print(" "+k);
                k++;
            }
            System.out.print("\n");
        }
    }   
}
