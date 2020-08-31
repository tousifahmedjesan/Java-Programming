// Array sum,average,smallest and leargest...
package array.average.sum.smallest.largest;
import java.util.Scanner;
public class ArrayAverageSumSmallestLargest 
{
    public static void main(String[] args) 
    {
        int[] A;
        int n,c;
        double ave,sum=0,smallest,largest;
        A = new int[100];
        System.out.println ("Enter the array size :");
        Scanner X = new Scanner (System.in);
        n = X.nextInt();
        System.out.println ("Enter the array elements :");
        for (c=0; c<n; c++)
        {
            A[c] = X.nextInt();
            sum = sum+A[c];
        }
        ave = sum/n;
        
        System.out.println ("The sum is : "+sum);
        System.out.println ("The average is : "+ave);
        smallest = A[0];
        for (c=1;c<n;c++)
            if (smallest>A[c])
                smallest=A[c];
        System.out.println ("The smallest number of this array is :"+smallest);
        
        largest = A[0];
        for (c=1;c<n;c++)
            if (largest<A[c])
                largest=A[c];
        System.out.println ("The largest number of this array is :"+largest);
    }
    
}
