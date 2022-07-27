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
        String bin = Integer.toBinaryString(bin);
        for(int i = 0; i<bin.length; i++)
        {
            if(bin.charAt(i) == 1 && bin.charAt(i+1)!=0)
            {
                num++;
            }
            else
            {
                
            }
        }
    }
}
