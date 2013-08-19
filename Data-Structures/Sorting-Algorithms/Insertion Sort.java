import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author ahani
 */

/*
  Insertion Sort is a sorting algorithm that depends on swaps between elements until it sorted
  Complexity : Best Case -> O(n);
               Average Case -> O(n^2); 
               Worst Case -> O(n^2);
*/

public class InsertionSort {
    public static int[] Arr;
    
    public static void main(String[] args) {
        // Scanner Input = new Scanner(System.in);
        // BufferedReader Input = new BufferedReader(new InputStreamReader(System.in));
        Arr = new int[] {3, 4, 1, 7, 9, 10, 2, 0, 0};
        InsertionSort(Arr);
        for(int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }
    }
    
    public static void InsertionSort(int Arr[]) {
        for(int i = 1; i < Arr.length; i++) {
            int Tmp = Arr[i]; // Current Element in the Array
            int Index = i; // Current Index of the Element
            while(Index > 0 && Tmp < Arr[Index - 1]) { // Checking if the Current Element is lower than previous  
                Arr[Index] = Arr[Index - 1]; // Swap the 2 elements
                Index = Index - 1; // set the Index to the previous positin
            }
            Arr[Index] = Tmp; // Index is the Target position and set the element in that index
        }
    }
   
}
