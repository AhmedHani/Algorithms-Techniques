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
  Binary Search .. Recursion Approach 
Complexity : Worst Case -> O(log(n))
             Average Case -> O(log(n))
             Best Case -> O(1)
*/
public class BinarySearch {
    public static int[] Arr;
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Arr = new int[] {3, 4, 1, 7, 9, 10, 2, 0};
        Arrays.sort(Arr);
        boolean Result = false;
        Result = BinarySearch(9, 0, Arr.length);
        System.out.println(Result ? "Found" : "Not Found");
    }
    
    public static boolean BinarySearch(int Target, int Low, int High) {
        if(High < Low) return false;
        else {
            int Middle = (Low + High) / 2;
            if(Arr[Middle] > Target) {
                return BinarySearch(Target, Low, Middle - 1);
            } else if(Arr[Middle] < Target) {
                return BinarySearch(Target, Middle + 1, High);
            } else {
                return true;
            }
        }
    }
    
}
