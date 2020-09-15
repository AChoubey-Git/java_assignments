package hr.Regex;

import java.util.Scanner;

public class Ip_Validate {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}
final class MyRegex{

	String regex="(\\d{0,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	String pattern = regex+"\\."+regex+"\\."+regex+"\\."+regex;
	
}

