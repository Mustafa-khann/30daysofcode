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

        int[][] arr = new Array[6][6];
        int max = 0;
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
        // Solution
        for(int i = 0; i<6; i++)
        {
            for(int j = i; j<3; j++)
            {
                int int1= arr[i];
                int sum = int1+int1;
                if(max<sum)
                {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
