package Day3;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        CheckTrees checkTrees = new CheckTrees();

        System.out.println(checkTrees.contTrees() * checkTrees.countTreesFiveOne() * checkTrees.countTreesOneOne()
        * checkTrees.countTreesOneTwo() * checkTrees.countTreesSevenOne());
    }
}
