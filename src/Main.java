import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
//        KawehEd();
//        aritmatikaDasar();
//        percabanganIfElse();
//        loopingWhile();
//        arrayLooping();
//        pointerLearn();
        sortnSearch();
    }

    public static void KawehEd() {
        System.out.println("Hallo Semuanya");
    }

    public static void aritmatikaDasar() {
        int firstNumber = 101;
        int secondNumber = 50;
        System.out.printf("%s%d %n", "Pertambahan ", firstNumber + secondNumber);
        System.out.printf("%s%d %n", "Pengurangan ", firstNumber - secondNumber);
        System.out.printf("%s%d %n", "Perkalian ", firstNumber * secondNumber);
        System.out.printf("%s%d %n", "Pembagian ", firstNumber / secondNumber);
        System.out.printf("%s%d %n", "Modulus ", firstNumber % secondNumber);
    }

    public static void percabanganIfElse() {
        int firstNumber = 120;
        int secondNumber = 40;
        if (firstNumber > secondNumber) {
            System.out.println("Second Number lebih kecil dari pada first number");
        } else if (secondNumber > firstNumber) {
            System.out.println("Second number lebih besar dari pada first number");
        } else {
            System.out.println("Second Number lebih kecil dari pada first number");
        }

    }

    public static void loopingWhile() {
        int number = 0;

        while(number < 5) {
            ++number;
            System.out.println(number);
        }

        do {
            ++number;
            System.out.println(number);
        } while(number < 5);

    }

    public static void arrayLooping() {
        String[] buah = new String[]{"Mangga", "Mengkudu", "Dukuh", "Pisang", "Apel", "Anggur"};
        int[] Integer = new int[]{1, 2, 3, 4, 5, 6};
        String[] fruit = buah;
        int total_fruit = buah.length;

        for(int i = 0; i < total_fruit; ++i) {
            String s = fruit[i];
            System.out.println(s);
        }

    }

    public static void pointerLearn() {
        String mango = "mango";
        String mango2 = new String("mango");
        if (mango.equals(mango2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (mango == mango2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void sortnSearch()
    {
        // Unsorted Array
        int array[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        System.out.println("Unorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Sorting the array
        Arrays.sort(array);

        // Printing sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Scanner searchObj = new Scanner(System.in);
        System.out.print("Masukan Pencaharian : ");

        int key = searchObj.nextInt();

        // Using binarySearch to search for desired element
        int index = Arrays.binarySearch(array, key);

        // Printing result
        if (index >= 0)
            System.out.println("Element "+ key +" found at index: " + index);
        else
            System.out.println("Element not found");
    }
}
