package hr.Exception;
import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public  int power(int a,int b) throws Exception{
        int result;
        if(a==0&&b==0){
            throw new Exception ("n and p should not be zero.");
        }
        else if(a<0|b<0){
            throw new Exception ("n or p should not be negative.");
        }
        else{
            result = (int)Math.pow(a,b);
            return result;
        }


    }
    
}

public class Exception2 {
	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
//.............OUTPUT................
//10 0
//0 10
//-1 4
//2 -3
//-2 -2
//5 6
//3 3
//8 0
//2 3
//3 -3