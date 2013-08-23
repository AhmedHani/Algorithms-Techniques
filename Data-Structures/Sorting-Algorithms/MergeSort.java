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
 Merge sort, the main idea for it is Divide and conquer, Dividing to sequence to sub-sequences, and sort every subsequence
 then merge them again to a sorted sequence
 
Complexity : Worst Case -> O(n log(n))
             Average Case -> O(n log(n))
             Best Case -> O(n log(n))
*/
public class MergeSort {
    public static int[] Arr;
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Arr = new int[] {3, 4, 1, 7, 9, 10, 2, 0, 0};
        Parition(Arr, 0, Arr.length - 1);
        for(int i = 0; i < Arr.length; i++) System.out.println(Arr[i]);
    }
    public static void MergeSort(int Arr[], int Low, int Middle, int High) {
        int Sorted[] = new int[Arr.length];
        int First = Low;
        int i = Low;
        int Mid = Middle + 1;
        
        while((First <= Middle) && (Mid <= High)) {
            if(Arr[First] <= Arr[Mid]) {
                Sorted[i] = Arr[First];
                First++;
            } else {
                Sorted[i] = Arr[Mid];
                Mid++;
            }
            i++;
        }
        if(First > Middle) {
            for(int k = Mid; k <= High; k++) {
                Sorted[i] = Arr[k];
                i++;
            }
        } else {
            for(int k = First; k <= Middle; k++) {
                Sorted[i] = Arr[k];
                i++;
            }
        }
        for(int k = Low; k <= High; k++) Arr[k] = Sorted[k];
    }
    
    public static void Parition(int Arr[], int Low, int High) {
        int Middle;
        if(Low < High) {
            Middle = (Low + High) / 2;
            Parition(Arr, Low, Middle);
            Parition(Arr, Middle + 1, High);
            MergeSort(Arr, Low, Middle, High);
        }
    }
}
