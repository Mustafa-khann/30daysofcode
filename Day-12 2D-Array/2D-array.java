


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
         // Solution
    for(int l = 0; l<6; l++)
    {
        for(int k=l; k<4; k++)
        {
            for(int i = k; i<3; i++)
            {
                for(int j = i; j<3; j++)
                {
                    System.out.println("element: " +arr.get(i).get(j));
                    if(max < sum)
                    {
                        // fuck it, imma do it tommorow
                        max = sum;
                    }
                }
            }
        }
    }
    System.out.println(max);
    }
}