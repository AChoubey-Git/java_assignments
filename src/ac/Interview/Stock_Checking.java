package ac.Interview;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Stock_Checking {

	// Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	Arrays.sort(ar);
        int count=0;
        for(int i=0;i<n-1;i++){
           if(ar[i]==ar[i+1]) {
        	   i++;
        	   count++;
           }
            
        }
       return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     	//BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }

}
//9
//10 20 20 10 10 30 50 10 20
//10
//1 1 3 1 2 1 3 3 3 3