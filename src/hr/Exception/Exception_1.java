package hr.Exception;

import java.util.Scanner;
import java.util.*;

public class Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
        int x,y,result;
        try{
        	x = stdin.nextInt();
            y = stdin.nextInt();
            result=x/y;
            System.out.println(result);
            
        }
        catch(InputMismatchException|ArithmeticException ef){
        	System.out.println(ef);
        }
        finally {
            if (stdin != null) { 
                System.out.println("Closing Scanner");
                stdin.close(); 
            } else { 
                System.out.println("Scanner not open");
            } 
        } 

	}

}
