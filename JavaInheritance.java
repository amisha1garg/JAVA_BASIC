//the task is to add a method in class cls2 naming task() which will take 2 parameters as input i.e. a and b and print the sum of their squares i.e a2+b2. Changes in the main function has been made already.
//
//        Input:
//        The input line contains T, denotes the number of testcase. Each testcase contains one line containing a and b separated by space.
//
//        Output:
//        For each testcase in new line, print the required answer.
//
//        Constraints:
//        1 <= T <= 100
//        1 <= a, b <= 103
//
//        Example:
//        Input:
//        1
//        2 4
//
//        Output:
//        6
//        8
//        20

// { Driver Code Starts
//Initial Template for Java

import java.util.Scanner;
import java.io.*;
import java.lang.Math;
class cls1
{
    void add(int p,int q)
    {
        System.out.println(p+q);
    }
}

public class JavaInheritance{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            cls2 obj=new cls2();
            int a=sc.nextInt();
            int b=sc.nextInt();
            //String tilde=sc.next();
            obj.add(a,b);
            obj.mul(a,b);
            obj.task(a,b);
            //System.out.println("~");
        }
    }
}


// } Driver Code Ends
//User function Template for Java
class cls2 extends cls1
{
    void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    void task(int a,int b)
    {
        System.out.println(a*a + b*b);
    }
}

// { Driver Code Starts.
// } Driver Code Ends
