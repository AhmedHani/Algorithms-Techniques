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
 this insertion sort using Recursion approach;
*/
public class InsertionSort {
    public static int[] Arr;
    
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Arr = new int[] {3, 4, 1, 7, 9, 10, 2, 0, 0};
        InsertionSort(0, Arr.length - 1);
        for(int i = 0; i < Arr.length; i++) System.out.println(Arr[i]);
    }
    public static void InsertInPosition(int Element, int Low, int High) {
        if(Element >= Arr[High]) {
            Arr[High + 1] = Element;
        } else if(Low < High) {
            Arr[High + 1] = Arr[High];
            InsertInPosition(Element, Low, High - 1);
        } else {
            Arr[High + 1] = Arr[High];
            Arr[High] = Element;
        }
    }
    public static void InsertionSort(int Low, int High) {
        if(Low < High) {
            InsertionSort(Low, High - 1);
            InsertInPosition(Arr[High], Low, High - 1);
        }
    }
    
    
}
