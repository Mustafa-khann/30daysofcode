


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static int hourGlassSum(ArrayList<Integer>)
    {
        int rows = arr.length;
        int columns = arr[0].length;
        int maxHourglassSum = -63;
        for(int i = 0; i<rows-2; i++)
        {
            for(int j = 0; j<columns-2; j++)
            {
                int currentHourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                +arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                maxHourglassSum = Math.max(maxHourglassSum, currentHourglassSum);
            }
        }
        return maxHourglassSum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        bufferedReader.close();
        int output = hourGlassSum(arr);
        System.out.println(output);
    }
}