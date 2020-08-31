
package sum.of.two.matrices;

import java.util.Scanner;

public class SumOfTwoMatrices {

    public static void main(String[] args) {
        int[][] A,B,C;
        int i,j,k,l,m,n,r,c;
        A = new int [100][100];
        B = new int [100][100];
        C = new int [100][100];
        Scanner w = new Scanner (System.in);
        System.out.println("Enter the Raw size : ");
        r = w.nextInt();
        System.out.println("Enter the cloumn size : ");
        c = w.nextInt();
        System.out.println("Please enter the values of 1st matrix elements : ");
        for (i=0;i<r;i++)
            for (j=0;j<c;j++){
                System.out.println("Please Enter the value of A ("+(i+1)+","+(j+1)+") : ");
                A[i][j] = w.nextInt();
            }
        System.out.println("Please enter the values of 2nd matrix elements : ");
        for (i=0;i<r;i++)
            for (j=0;j<c;j++){
                System.out.println("Please Enter the value of B ("+(i+1)+","+(j+1)+") : ");
                B[i][j] = w.nextInt();
            }
        for (i=0;i<r;i++)
            for (j=0;j<c;j++)
                C[i][j] = A[i][j]+B[i][j];
        System.out.println("The 1st matrix is : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++)
                System.out.print("  "+A[i][j]);
            System.out.println("");
        }
        System.out.println("The 2nd matrix is : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++)
                System.out.print("  "+B[i][j]);
            System.out.println("");
        }
        System.out.println("The sum is : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++)
                System.out.print("  "+C[i][j]);
            System.out.println("");
        }
    }
}
