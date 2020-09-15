package calendar;

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuilder tempstr = new StringBuilder();
        tempstr.append(A);
        tempstr=tempstr.reverse();
       //String str=tempstr.toString();
        if(tempstr.toString().equals(A)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



