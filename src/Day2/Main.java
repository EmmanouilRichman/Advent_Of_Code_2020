package Day2;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        validPasswords validPasswords = new validPasswords();

        System.out.println(validPasswords.valid());
    }

}
