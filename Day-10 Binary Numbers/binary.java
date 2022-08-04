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

        bufferedReader.close();
        int num = 0;
        int temp = 0;
        String bin = Integer.toBinaryString(n);
        for(int i = 0; i<bin.length(); i++)
        {
            
            if(bin.charAt(i)=='1')
            {
                num++;
                if(temp<num)
                {
                    temp=num;
                }
            }
            else if(bin.charAt(i)=='0')
            {
                num = 0;
            }
        }
        System.out.println(temp);
    }
}
