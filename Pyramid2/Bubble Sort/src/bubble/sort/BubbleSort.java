package bubble.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] A;
        int i,j,k,l,t;
        A = new int[100];
        Scanner x = new Scanner (System.in);
        System.out.println("Enter the size of array : ");
        k = x.nextInt();
        System.out.println("Enter the array elements : ");
        for (i=0;i<k;i++)
            A[i] = x.nextInt();
        for (i=0;i<k;i++)
            for (j=0;j<k-1;j++)
                if (A[j]>A[j+1])
                {
                    t=A[j];
                    A[j]=A[j+1];
                    A[j+1]=t;
                }
        System.out.println("Result after sorting: ");
        for (i=0; i<k; i++)
            System.out.print(""+A[i]+" ");
        System.out.println("");
    }
    
}
