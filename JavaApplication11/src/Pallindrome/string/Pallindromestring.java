
package Pallindrome.string;

import java.util.*;

public class Pallindromestring {
    public static void main(String[] args) {
       String n, rev = "";
        System.out.println("Enter a string to cheak if it is pallindrome : ");
        Scanner x = new Scanner(System.in);
        n = x.nextLine();
        int length = n.length();
        for (int i = length-1; i>=0; i--)
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
        
    }
    
}
