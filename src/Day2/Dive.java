package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dive {

    public static void main (String[] args) {

        int depth = 0;
        int horizontal = 0;

        try{
            File movements  = new File("actualdata.txt");
            Scanner scanner = new Scanner(movements);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                depth += calculateDepth(data);
                horizontal += calculateHorizontal(data);
            }
            System.out.println("total depth: " + depth + "\ntotal horizontal: " + horizontal);
            int multiply = depth *horizontal;
            System.out.println(multiply);
        }
        catch (FileNotFoundException e){
            System.out.println("Bestand kon niet gelezen worden");
            System.out.println(e);
        }

    }

        public static int calculateDepth (String movement){

        int depth = 0;
        int number = Integer.parseInt(movement.substring(movement.length() - 1).trim());

        if (movement.contains("down")) {
            depth += number;
        }
        else if (movement.contains("up")) {
            depth -= number;
        }

        return depth;
    }
    public static int calculateHorizontal (String movement){

        int horizontal = 0;
        int number = Integer.parseInt(movement.substring(movement.length() - 1).trim());

        if (movement.contains("forward")) {
            horizontal += number;
        }
        return horizontal;
    }

}
