package Task;

import Task.Model.modelViewMenu;

import java.util.Scanner;
public class WeekThree {

    // Initialization Variable
    static Scanner scan = new Scanner(System.in);
    static modelViewMenu menu = new modelViewMenu();
    public static void main(String[] args) {
        viewMenu();
    }

    public static void viewMenu(){
        menu.menuOne();

        System.out.print("Choose Number : ");
        String numMenu = scan.nextLine();

        if (numMenu.equals("1")){
            InputOutput();
            dataVariable();
            makeAstring();
            nextornot();
        } else if (numMenu.equals("2")) {
            menu.menuTwo();
            System.out.print("Choose Number : ");
            String numSecondMenu = scan.nextLine();
            if (numSecondMenu.equals("1"))
                circleAreaFormula();
            else if (numSecondMenu.equals("2"))
                blockVolume();
            nextornot();
        } else {
            System.out.println("the number you input does not exist");
        }
    }

    public static void InputOutput(){
        System.out.print("Masukan nama anda : ");
        String name = scan.nextLine();
        System.out.println("Selamat datang di bootcamp Kawah Edukasi," + name);
    }

    public static void dataVariable(){
        short s = 10000;
        short r = -20000;
        double testDouble = 102;
        double twoDouble = -101;
        char myFirstletter = 'M';
        char mySecondletter = 'M';
        boolean myFirstbool = true;
        boolean mySecondbool = false;
        System.out.println(s);
        System.out.println(r);
        System.out.println(testDouble);
        System.out.println(twoDouble);
        System.out.println(myFirstletter);
        System.out.println(mySecondletter);
        System.out.println(myFirstbool);
        System.out.println(mySecondbool);
    }

    public static void makeAstring() {
        String stringOne = "Saya senang ";
        String stringTwo = "belajar ";
        String stringThree = "Java language";

        System.out.println(stringOne + stringTwo + stringThree);
    }

    public static void circleAreaFormula(){
        double wide, phi=3.14;
        int r;
        System.out.print("Masukan Jari-jari : ");
        r=scan.nextInt();
        wide=phi*r*r;
        System.out.println("The area of the circle is = "+wide);
    }

    public static void blockVolume(){
        int longs, wide, tall, result;

        System.out.print("Input longs block: ");
        longs = scan.nextInt();

        System.out.print("Input wide block: ");
        wide = scan.nextInt();

        System.out.print("Input tall block: ");
        tall = scan.nextInt();

        result =  2 * ((longs * wide) + (longs * tall) + (wide * tall));

        System.out.println("the area of the block is: " + result);
    }

    public static void nextornot() {
        System.out.print("Want Continue ? Y/N :");
        String selectMenu = scan.nextLine();
        if (selectMenu.equals("Y"))
            viewMenu();
        else if (selectMenu.equals("N"))
            scan.close();
        else
            System.out.println("Nothing here!!");
    }
}
