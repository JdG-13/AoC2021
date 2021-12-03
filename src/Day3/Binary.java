package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Binary {

    public static void main(String[] args){

//        File file = new File("binarytest.txt");
        File file = new File("binary.txt");

        Integer counter = 0;

        Integer total1 = 0;
        Integer total2 = 0;
        Integer total3 = 0;
        Integer total4 = 0;
        Integer total5 = 0;
        Integer total6 = 0;
        Integer total7 = 0;
        Integer total8 = 0;
        Integer total9 = 0;
        Integer total10 = 0;
        Integer total11 = 0;
        Integer total12 = 0;

        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String binary = scanner.nextLine();

                total1 += addTo1(binary);
                total2 += addTo2(binary);
                total3 += addTo3(binary);
                total4 += addTo4(binary);
                total5 += addTo5(binary);
                total6 += addTo6(binary);
                total7 += addTo7(binary);
                total8 += addTo8(binary);
                total9 += addTo9(binary);
                total10 += addTo10(binary);
                total11 += addTo11(binary);
                total12 += addTo12(binary);

                counter +=1 ;
            }

            ArrayList <Integer> totals = new ArrayList<>(Arrays.asList(total1,total2,total3,total4,total5,total6,total7,total8,total9,total10,total11,total12));

            for (int i = 0; i < totals.size(); i++) {

                if (totals.get(i)>(counter/2)){
                    gamma.append("1");
                    epsilon.append("0");
                }else {
                    gamma.append("0");
                    epsilon.append("1");
                }
            }

            System.out.println(total3);
            System.out.println(counter);

            System.out.println("Gamma: " + gamma);
            System.out.println("Epsilon: " + epsilon);

        } catch (FileNotFoundException e) {
            System.out.println("Bestand kon niet gelezen worden");
        }

    }

    public static Integer addTo1 (String binary){
        return Integer.parseInt(binary.substring(0, 1).trim());
    }

    public static Integer addTo2 (String binary){
        return Integer.parseInt(binary.substring(1,2).trim());
    }

    public static Integer addTo3 (String binary){
        return Integer.parseInt(binary.substring(2,3).trim());
    }

    public static Integer addTo4 (String binary){
        return Integer.parseInt(binary.substring(3,4).trim());
    }

    public static Integer addTo5 (String binary){
        return Integer.parseInt(binary.substring(4,5).trim());
    }

    public static Integer addTo6 (String binary){
        return Integer.parseInt(binary.substring(5,6).trim());
    }

    public static Integer addTo7 (String binary){
        return Integer.parseInt(binary.substring(6,7).trim());
    }

    public static Integer addTo8 (String binary){
        return Integer.parseInt(binary.substring(7,8).trim());
    }

    public static Integer addTo9 (String binary){
        return Integer.parseInt(binary.substring(8,9).trim());
    }

    public static Integer addTo10 (String binary){
        return Integer.parseInt(binary.substring(9,10).trim());
    }

    public static Integer addTo11 (String binary){
        return Integer.parseInt(binary.substring(10,11).trim());
    }

    public static Integer addTo12 (String binary){
        return Integer.parseInt(binary.substring(11,12).trim());
    }

}
