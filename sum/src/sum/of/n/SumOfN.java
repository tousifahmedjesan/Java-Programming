package sum.of.n; 
import java.io.PrintStream;
import java.util.Scanner;
 
public class SumOfN
{
   public static void main(String args[])
   {
     int n,x,sum=0;
     PrintStream printf ;
     System.out.print ("Enter the value of n : ");
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     for (x=1;x<=n;x++)
     {
         sum=sum+x;
     }
       printf=System.out.printf ("Sum of 1+2+3+4+...+%d = %d\n",n,sum);
   }
}
