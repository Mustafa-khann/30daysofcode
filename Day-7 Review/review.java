import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        String inputString = new String(20);
        Array StrArray = new Array(inputString.length());
        Array StrEven = new Array(inputString.length()/2);
        Array StrOdd = new Array(inputString.length()/2);
        // Scanner for String input
        Scanner inputScanner = new Scanner(System.in);
        inputString = inputScanner.nextLine();
        for(int i = 0; i<inputString.length(); i++)
        {
            StrArray[i] = inputString.charAt(i);
        }
        for(int i = 0; i<inputString.length(); i+2)
        {
            int j=0;
            StrEven[j] = StrArray[i];
            j++;
        }
    }
}