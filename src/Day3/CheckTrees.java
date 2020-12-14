package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CheckTrees {
    private final int TOTAL_ROWS = 323;
    private final int TOTAL_COLS = 31;
    private String[][] map = new String[TOTAL_ROWS][TOTAL_COLS];

    public CheckTrees(){

    }

    public void FillMap() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/manny/Downloads/advent2020/src/Path.txt"));
        int currRow = 0;
        int count = 0;

        while(scanner.hasNext()){
            String line = scanner.nextLine();
            line = line.replace(" ", "");

           for(int i = 0; i < TOTAL_COLS; i++){
               map[currRow][i] = Character.toString(line.charAt(count++));
           }
           currRow++;
           count = 0;

        }
    }

    public int contTrees() throws FileNotFoundException {
        FillMap();
        int count = 0;
        int currCol = 3;

        for(int i = 1; i < TOTAL_ROWS; i++) {
            if(map[i][currCol].equals("#")){
                count++;
            }
            if((currCol + 3) >= TOTAL_COLS){
                currCol = (currCol + 3)  % TOTAL_COLS;
            }
            else {
                currCol += 3;
            }
        }
        return count;
    }
}

