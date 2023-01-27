import java.util.*;

public class InputUser {
    public static void main(String[] args) {

        /*
        Sorting dan searching adalah hal yang sangat penting di dalam java karna bisa
        menyusun angka maupun huruf dan bisa kita search index nya.
        */

        // Insert into array static

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan jumlah array : ");
        int inputLength = Integer.parseInt(scan.nextLine());
        int [] arrayX = new int[inputLength];

        for (int index = 0 ; index<arrayX.length; index++){
            System.out.print("Angka yang dimassukan : ");
            arrayX[index] = scan.nextInt();
        }

        int total = 0;
        for (int i = 0; i < arrayX.length; i++){
            total += arrayX[i];
        }
        double mean = total/arrayX.length;
        System.out.println(Arrays.toString(arrayX));
        System.out.println(mean);

        // Sorting Array

        Arrays.sort(arrayX);

        System.out.println("Sorted Array:");
        for (int i = 0; i < arrayX.length; i++){
            System.out.print(arrayX[i] + " ");
        }
        System.out.println();

        // Searching

        System.out.println("Masukan Pencaharian :");

        int searchIndex = scan.nextInt();

        int index = Arrays.binarySearch(arrayX,searchIndex);

        if (index >= 0)
            System.out.println("Element "+searchIndex+" found at index: " + index);
        else
            System.out.println("Element not found");


    }
}
