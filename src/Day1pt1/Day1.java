package Day1pt1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *
 * Find the two numbers in the given input that add up to 2020. Then, multiply them to get your code.
 */
public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/manny/Downloads/advent2020/src/input.txt"));

        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 2020) {
                    int answer = list.get(i) * list.get(j);
                    System.out.println(answer);
                    return;
                }
            }
        }
    }
}
