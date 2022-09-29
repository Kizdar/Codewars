/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

 */

import java.util.Arrays;

public class ShortestWord {

        public static int findShort(String s) {
            String[] w = s.split(" ");
            int shorter = w[0].length();
            for (int i = 0; i < w.length - 1; i++) {
                if (w[i].length() < shorter) {
                    shorter = w[i].length();
                }
            }
            return shorter;
        }
}
