//Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
//
//        Example 1:
//
//        Input: S1 = "Geeks" , S2 = "forGeeks"
//        Output: "skeeGrofskeeG"
//        Explanation: Concatenating S1 and S2 to
//        get "GeeksforGeeks" then reversing it to
//        "skeeGrofskeeG".



// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class JavaStrings {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.conRevstr(S1, S2));
        }
    }
}
// } Driver Code Ends


// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String S = S1 + S2;
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        sb.reverse();
        String s = sb.toString();
        return s;

    }
}