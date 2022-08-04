import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String[] array = new String[n];
        for(int i = 0; i<n; i++)
        {
            array[i] = sc.nextLine();
        }
        for(int i = 0; i<n; i++)
        {
            char[] ch = array[i].toCharArray();
            for(int e = 0;e<ch.length; e+=2)
            {
                System.out.print(ch[e]);
            }
            System.out.print(" ");
            for(int o = 1; o<ch.length; o+=2)
            {
                System.out.print(ch[o]);
            }
            System.out.println("");
        }
    }}