package ac.RepeateString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.Exception.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long counta=0;
        char[] orgstr=s.toCharArray();
        long len=s.length();
        long remainloop;
        long loopvalue=n/len;
        System.out.println(loopvalue);
        for(int i=0;i<len;i++){
            if(orgstr[i]=='a'){
                    counta++;
            }
        }
        System.out.println(counta);
        counta=loopvalue *counta;
        System.out.println(counta);
        remainloop = n-(loopvalue*len);
        System.out.println(remainloop);
        for(int i=0;i<remainloop;i++){
            if(orgstr[i]=='a'){
                    counta++;
            }
        }
        return counta;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        
        System.out.println("result: " + result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        bufferedReader.close();

        scanner.close();
    }
}
