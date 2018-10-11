package com.sun.example.leetcode.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://leetcode.com/problems/reverse-integer/description/
 * 
 * @author I068353
 *
 */
public class ReverseInteger {

    public static int reverse(int x) {
        long reversed = 0;

        if (x < -2147483648 && x > 2147483647) {
            return 0;
        }

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
            if (reversed < -2147483648 || reversed > 2147483647) {
                return 0;
            }
        }

        return (int) reversed;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = reverse(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }

}
