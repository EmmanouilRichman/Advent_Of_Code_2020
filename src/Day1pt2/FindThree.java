package Day1pt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindThree {
    List<Integer> list;
    public FindThree(){
        list = new ArrayList<>();
    }

    /**
     * Find the product of the three numbers that add to 2020
     * @return product desired
     * @throws FileNotFoundException thrown if file is not found
     */

    public int find() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/manny/Downloads/advent2020/src/input.txt"));

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        for(int i = 0; i < list.size() - 2; i++){
            for(int j = i + 1; j < list.size() - 1; j++){
                for(int k = j + 1; k < list.size(); k++){
                    if(list.get(i) + list.get(j) + list.get(k) == 2020){
                        return (list.get(i) * list.get(j) * list.get(k));
                    }
                }
            }
        }

        return 0;
    }
}
