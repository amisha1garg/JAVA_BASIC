//Given a string, remove spaces from it.
//
//        Example 1:
//
//        Input:
//        S = "geeks  for geeks"
//        Output: geeksforgeeks
//        Explanation: All the spaces have been
//        removed.

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Remvspace
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();

            Solution ob = new Solution();

            System.out.println(ob.modify(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution
{

    String modify(String s)
    {
        // your code here
        s = s.replaceAll("\\s", "");
        return s;
    }
}
