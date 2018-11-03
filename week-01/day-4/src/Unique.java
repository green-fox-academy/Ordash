//  Create a function that takes a list of numbers as a parameter
//  Returns a list of numbers where every number in the list occurs only once

//  Example
//  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
//  should print: `[1, 11, 34, 52, 61]`
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {

        int[] arr = {1, 11, 34, 11, 52, 61, 1, 34};

        int L = arr.length;


        Arrays.sort(arr);


        int[] nodupes = removeDupes(arr, L);

        System.out.print("Sorted without duplicates: ");
        for (int k = 0; k <  arr.length; k++) {
            System.out.print(nodupes[k] + ", ");
        }

    }

    public static int[] removeDupes (int[] arrinput, int Linput) {

        Arrays.sort(arrinput);
        int j = 0;


        for (int i = 0; i < Linput-1; i++) {

            if(arrinput[i] != arrinput[i+1]) {

                arrinput[j++] = arrinput[i];

            }


        }

        arrinput[j++] = arrinput[Linput-1];

        for (int k = 0; k < j; k++) {

            arrinput[k] = arrinput[k];
        }


        return arrinput;

    }


}