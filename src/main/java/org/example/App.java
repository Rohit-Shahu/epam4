package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    private static float average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    private static List<String> aList(List<String> list) {
        return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
    }

    private static List<String> palindromeList(List<String> list) {
        List<String> pal_lst = new ArrayList<>();
        for (String value : list) {
            if (isPalindrome(value)) {
                pal_lst.add(value);
            } else {
                return null;
            }
        }

        return pal_lst;
    }
    private static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
