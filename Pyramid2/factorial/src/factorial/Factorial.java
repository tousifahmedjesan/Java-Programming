//Factorial !
package factorial;
import java.util.Scanner;

public class Factorial 
{

    public static void main(String[] args) 
    {
        int a,i,f=1;
        Scanner O = new Scanner (System.in);
        System.out.println ("Enter the value of 'a' to find its factorial : ");
        a = O.nextInt();
        for (i=1;i<=a;i++)
        {
            f = f * i;
        }
        System.out.println("The Factorial value of "+a+" is "+f);
    }
    
}
