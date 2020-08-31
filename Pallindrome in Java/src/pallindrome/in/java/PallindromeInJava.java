
package pallindrome.in.java;

import java.util.*;

public class PallindromeInJava {
    public static void main(String[] args) {
        String n , z , rev = "";
        System.out.println("Enter a string to cheak if it is pallindrome : ");
        Scanner x = new Scanner(System.in);
        n = x.nextLine();
        int length = n.length();
        for (int i = length-1;i>=0;i--)
        {
            rev =rev + n.charAt(i);
        }
        if (n.equals(rev))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
        String m , w , r = "";
        System.out.println("Enter a number string to cheak if it is pallindrome : ");
        
        m = x.nextLine();
        int l;
        l = m.length();
        for (int i = l-1;i>=0;i--)
        {
            r =r + m.charAt(i);
        }
        if (m.equals(r))
        {
            System.out.println("It is a palindrome.");
        }
        else
        {
            System.out.println("It is not a palindrome.");
        }
    }
    
}
