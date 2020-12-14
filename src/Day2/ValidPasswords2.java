package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ValidPasswords2 {
    Set<String> set;
    public ValidPasswords2(){

    }

    public int valid() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/manny/Downloads/advent2020/src/passwords.txt"));
        int num1 = 0;
        int num2 = 0;
        int answer = 0;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            while(lineScanner.hasNext()) {

                //setting up range values
                String range = lineScanner.next();
                range = range.replace('-', ' ');
                Scanner rangeScanner = new Scanner(range);
                num1 = Integer.parseInt(rangeScanner.next());
                num2 = Integer.parseInt(rangeScanner.next());

                //Getting character to match
                char charToMatch = lineScanner.next().charAt(0);

                //Getting password
                String password = lineScanner.next();

                if((charToMatch == password.charAt(num1 - 1) && charToMatch != password.charAt(num2 - 1)) || (charToMatch != password.charAt(num1 - 1) && charToMatch == password.charAt(num2 - 1))){
                    answer++;
                }
            }

        }
        return answer;
    }
}
