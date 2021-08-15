package week02;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {

    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    public static boolean isAnagram1(String s, String t){
        if (s.length() != t.length()) return false;

        Map<Character, Integer> table = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0){
                return false;
            }
        }

        return true;
    }
}
