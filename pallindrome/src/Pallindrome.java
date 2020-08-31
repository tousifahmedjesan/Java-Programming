
import java.util.Scanner;
public class Pallindrome 
{
    public static void main(String[] args) 
    {
        int n , z , r, rev = 0;
        System.out.println("Enter the number to cheak if it is pallindrome : ");
        Scanner X = new Scanner (System.in);
        n = X.nextInt();
        z = n;

        while( n!=0 )
        {
            r = n%10;
            rev = rev*10 + r;
            n /= 10;
        }

        if (z == rev)
            {
            System.out.println(z+" is a palindrome.");
        }
        else
        {
            System.out.println(z+" is not a palindrome.");
        }
    }
    
}
