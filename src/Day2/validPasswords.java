package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class validPasswords {
    Set<String> set;
    public validPasswords(){
        set = new HashSet<>();
    }

    public int valid() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/manny/Downloads/advent2020/src/passwords.txt"));
        int num1 = 0;
        int num2 = 0;
        int totalRight = 0;
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
                for(char c: password.toCharArray()){
                    if(c == charToMatch){
                        totalRight++;
                    }
                }
                if(totalRight >= num1 && totalRight <= num2){
                    answer++;
                }
                totalRight = 0;
            }

        }
        return answer;
    }
}
