package ac.RepeateString;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

      Calendar cal = Calendar.getInstance();
        cal.set(year,month,day);
        cal.set(Calendar.MONTH,month);
        cal.set(Calendar.DAY_OF_MONTH,day);
        cal.set(Calendar.YEAR,year);
        int weekday=cal.get(Calendar.DAY_OF_WEEK);
        String Day=null;
        switch(weekday){
            case 0 : Day="SUNDAY";
                    break;
            case 1 : Day="MONDAY";
                    break;
            case 2 : Day="TUESDAY";
                    break;
            case 3 : Day="WEDNESDAY";
                    break;
            case 4 : Day="THURSDAY";
                    break;
            case 5 : Day="FRIDAY";
                    break;
            case 6 : Day="SATURDAY";
                    break;
            

        }
        return Day;
    }

}

public class CalendarDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
