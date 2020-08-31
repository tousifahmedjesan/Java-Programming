//Bainary Search :
package bainary.search;

import java.util.Scanner;

public class BainarySearch {
    public static void main(String[] args) {
       int[] A;
       int b=0 , d, e, t, i, j, m, n, s;
       A = new int [100];
       Scanner in = new Scanner (System.in);
       System.out.print ("Please enter the array size: ");
       n = in.nextInt();
       e = n-1;
       m=(b+e)/2;
       System.out.println("Please Enter the array elements : ");
       for (i=0;i<n;i++)
           A[i]=in.nextInt();
        
       for (i=0;i<n;i++)
       {
            t=A[i];
            for(j=i+1;j<n;j++)
                if (t>A[j])
                {
                    t=A[j];
                    A[j]=A[i];
                    A[i]=t;
                }
        }
        d=A[m];
        System.out.println("Afer sorting, the array elements are: ");
        for (i=0;i<n;i++)
            System.out.print(" "+A[i]);
        System.out.println("\nplease enter the searching item : ");
        s = in.nextInt();
        for (i=1; i<=n; i++)
        {
            if (d==s)
                break;
            else if (s>d)
            {
                b=m+1;
                m=(b+e)/2;
                d=A[m];
            }
            else if (s<d)
            {
                e=m-1;
                m=(b+e)/2;
                d=A[m];
            }
        }
        if (d==s)
                System.out.println("We successfully find "+s+" in step : "+i);
        else
                System.out.println(s+" is not exist in this array.");

    }
    
}
