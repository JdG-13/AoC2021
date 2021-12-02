package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Part2 {
    public static void main (String[] args) {

        int depth = 0;
        int horizontal = 0;
        int aim = 0;

        try{
            File movements  = new File("actualdata.txt");
            Scanner scanner = new Scanner(movements);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                aim += calculateAim(data);
                horizontal += calculateHorizontal(data);
                if (calculateHorizontal(data)>0){
                    depth += calculateDepth(calculateHorizontal(data), aim);
                }
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
    public static int calculateAim (String movement){

        int aim = 0;
        int number = Integer.parseInt(movement.substring(movement.length() - 1).trim());

        if (movement.contains("down")) {
            aim += number;
        }
        else if (movement.contains("up")) {
            aim -= number;
        }

        return aim;
    }

    public static int calculateHorizontal (String movement){

        int horizontal = 0;
        int number = Integer.parseInt(movement.substring(movement.length() - 1).trim());

        if (movement.contains("forward")) {
            horizontal += number;
        }

        return horizontal;
    }

    public static int calculateDepth (int horizontal, int aim){

        return horizontal*aim;

    }
}
