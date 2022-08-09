import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }
        int temp;
        int numberOfSwaps = 0;
        boolean sorted = false;
        bufferedReader.close();
        for (int i = 0; i < n; i++) {
        // Track number of elements swapped during a single array traversal
        for (int j = 0; j < n - 1; j++) {
            // Swap adjacent elements if they are in decreasing order
            if (a.get(j) > a.get(j+1)) {
                a.set(j, a.get(j+1));
                numberOfSwaps++;
            }
        }
        // If no elements were swapped during a traversal, array is sorted
        if (numberOfSwaps == 0) {
            break;
        }
      }
      System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
      System.out.println("First Element: "+a.get(0));
      System.out.println("Last Element: "+a.get(size()-1));
    }
}