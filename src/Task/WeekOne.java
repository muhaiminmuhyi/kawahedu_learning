package Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Objects;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WeekOne {

    // initialization variable
    static Scanner scan = new Scanner(System.in);
    private static final String NEW_LINE = System.lineSeparator();

    public static void main(String[] args) {
        System.out.println("*******************************************************");
        System.out.println("*                Welcome To Calculator                *");
        System.out.println("*                                                     *");
        System.out.println("*           If you want to use calculator ,           *");
        System.out.println("*           select one of the numbers below           *");
        System.out.println("*                                                     *");
        System.out.println("*           1. Addition                               *");
        System.out.println("*           2. Subtraction                            *");
        System.out.println("*           3. Multiplication                         *");
        System.out.println("*           4. Division                               *");
        System.out.println("*           5. Modulus                                *");
        System.out.println("*                                                     *");
        System.out.println("*******************************************************");
        System.out.println("*               Created By Muhaimin Muhyi             *");
        System.out.println("*******************************************************");

        // Retrieve number menu from user
        System.out.print("Choose Number : ");
        int numMenu = scan.nextInt();

        // Take numbers to add
        System.out.print("First Number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Second Number : ");
        int secondNumber = scan.nextInt();

        if (numMenu == 1)
            Addition(firstNumber,secondNumber);
        else if (numMenu == 2)
            Subtraction(firstNumber,secondNumber);
        else if (numMenu == 3)
            Multiplication(firstNumber,secondNumber);
        else if (numMenu == 4)
            Division(firstNumber,secondNumber);
        else if (numMenu == 5)
            Modulus(firstNumber,secondNumber);
        else
            System.out.println("nothing but that number");
    }

    public static void Addition(int firstNumber, int secondNumber)
    {
        int resultAddition = firstNumber + secondNumber;
        System.out.println("The result is :" + resultAddition);
        WriteFiles(resultAddition,"Addition");
    }

    public static void Subtraction(int firstNumber, int secondNumber)
    {
        int resultSubtraction = firstNumber - secondNumber;
        System.out.println("The result is : " + resultSubtraction);
        WriteFiles(resultSubtraction, "Subtraction");
    }

    public static void Multiplication(int firstNumber, int secondNumber)
    {
        int resultMultiplication = firstNumber * secondNumber;
        System.out.println("The result is : " + resultMultiplication);
        WriteFiles(resultMultiplication, "Multiplication");
    }

    public static void Division(int firstNumber, int secondNumber)
    {
        int resultDivision = firstNumber / secondNumber;
        System.out.println("The result is : " + resultDivision);
        WriteFiles(resultDivision, "Division");
    }

    public static void Modulus(int firstNumber, int secondNumber)
    {
        int resultModulus = firstNumber % secondNumber;
        System.out.println("The result is : " + resultModulus);
        WriteFiles(resultModulus, "Modulus");
    }

    public static void WriteFiles(int result, String nameOperators)
    {
        try {
            File obj = new File(nameOperators+".txt");
            if (!obj.exists()){
                FileWriter Writer = new FileWriter(nameOperators+".txt");
                if (Objects.equals(nameOperators, "Addition")) {
                    Writer.write("the result of the sum of the inputs you input is " + result);
                    Writer.close();
                    System.out.println("Successfully written.");
                } else if (Objects.equals(nameOperators, "Subtraction")) {
                    Writer.write("the result of the deduction that has been reduced is " + result);
                    Writer.close();
                    System.out.println("Successfully written.");
                } else if (Objects.equals(nameOperators,"Multiplication")) {
                    Writer.write("the result of multiplication that has been multiplied is " + result);
                    Writer.close();
                    System.out.println("Successfully written.");
                } else if (Objects.equals(nameOperators, "Division")) {
                    Writer.write("the result of the division that has been divided is " + result);
                    Writer.close();
                    System.out.println("Successfully written.");
                } else if (Objects.equals(nameOperators, "Modulus")) {
                    Writer.write("the result of the modulus is " + result);
                    Writer.close();
                    System.out.println("Successfully written.");
                }
            } else {
                Path path = Paths.get(nameOperators+".txt");
                if (Objects.equals(nameOperators, "Addition")) {
                    appendToFile(path, NEW_LINE + "the result of the sum of the inputs you input is " + result);
                    System.out.println("Successfully append.");
                } else if (Objects.equals(nameOperators, "Subtraction")) {
                    appendToFile(path, NEW_LINE + "the result of the deduction that has been reduced is " + result);
                    System.out.println("Successfully append.");
                } else if (Objects.equals(nameOperators,"Multiplication")) {
                    appendToFile(path, NEW_LINE + "the result of multiplication that has been multiplied is " + result);
                    System.out.println("Successfully append.");
                } else if (Objects.equals(nameOperators, "Division")) {
                    appendToFile(path, NEW_LINE + "the result of the division that has been divided is " + result);
                    System.out.println("Successfully append.");
                } else if (Objects.equals(nameOperators, "Modulus")) {
                    appendToFile(path, NEW_LINE + "the result of the modulus is " + result);
                    System.out.println("Successfully append.");
                }
            }

        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    /**
     * This is feature reader file if want use add this line
     * readerFile(nameOperators) in if objects
     * Thank You :)
     **/

    public static void readerFile(String nameOperators)
    {
        try {
            File Obj = new File(nameOperators+".txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    /**
     * This is feature append when file already create.
     **/

    private static void appendToFile(Path path, String content) throws IOException
    {
        Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
