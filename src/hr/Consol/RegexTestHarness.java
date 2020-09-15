package hr.Consol;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
		//boolean flag=true;
		int n=0;
        while (n>=0) {

            Pattern pattern = 
            Pattern.compile(console.readLine("%nEnter your regex: "));

            Matcher matcher = 
            pattern.matcher(console.readLine("Enter input string to search: "));

            boolean found = false;
			/*
			MATCHER.FIND():: boolean(return type) of	 Attempts to find the next subsequence of the input sequence that matches the pattern.
			*/
            while (matcher.find()) {
                console.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
					/*
					 MATCHER.END():: int(return type) of	 Returns the offset after the last character matched.
					 MATCHER.START():: int(return type) of	Returns the start index of the previous match.
					 MATCHER.GROUP():: String(return type) of	Returns the input subsequence matched by the previous match.
					*/
					n++;
                found = true;
				
            }
            if(!found){
				
                console.format("No match found.%n");
            }
            n--;
        }
    }
}