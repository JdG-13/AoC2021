package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dive {

    public static void main (String[] args) {

        try{
            File movements  = new File("testdata.txt");
            Scanner scanner = new Scanner(movements);

            String firstLine = scanner.nextLine();
            int depthFirstLine = calculateDepth(firstLine);
            int horizontalFirstLine = calculateHorizontal(firstLine);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                calculateMovement(data,depthFirstLine, horizontalFirstLine);
                System.out.println("depth: " + depth + "\nhorizontal: " + horizontal);
            }
            System.out.println("depth: " + depth + "\nhorizontal: " + horizontal);
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

    public static void calculateMovement (String movement, int d, int h){

        int depth = 0;
        int horizontal = 0;
        int number = Integer.parseInt(movement.substring(movement.length() - 1).trim());

        if (movement.contains("down")) {
            depth += number;
        }
        else if (movement.contains("up")) {
            depth -= number;
        }
        else {
            horizontal += number;
        }

        return;
    }

}
