package armostrong.number;
import static java.lang.Math.pow;
import java.util.Scanner;

public class ArmostrongNumber {
    
    public static void main(String[] args) {
        int n, x, z, y = 0, r, c, sum = 0 ;
        System.out.print ("enter a number : ");
        Scanner X = new Scanner (System.in);
        n = X.nextInt();

        x = n;
        z = x;

        while (n != 0)
        {
            n = n/10;
            y++;
        }

        while (x != 0)
        {
            r = x % 10;
            c = (int) pow(r,y);
            sum = sum + c;
            x = x / 10;
        }

        if (sum == z)
        {
            System.out.print ("\nThe given number is Armstrong number\n");
        }
        else
        {
            System.out.print("\nThe given number is not a Armstrong number\n");
        }
    }
    
}
