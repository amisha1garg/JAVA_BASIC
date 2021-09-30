//Given a string. Count the number of Camel Case characters in it.
//
//        Example 1:
//
//        Input:
//        S = "ckjkUUYII"
//        Output: 5
//        Explanation: Camel Case characters present:
//        U, U, Y, I and I.
//

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class CountCamelCase
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            String s = sc.next ();
            System.out.println (new Sol().countCamelCase (s));
        }

    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countCamelCase (String s)
    {
        // your code here
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                count++;
            }
        }

        return count;
    }
}
