package com.sun.example.leetcode.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://leetcode.com/problems/palindrome-number/description/
 * 
 * @author I068353
 *
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int origin = x;
        
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }

        if(reversed==origin){
            return true;
        }else{
            return false;
        }
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            boolean ret = isPalindrome(x);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
