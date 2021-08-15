package week02;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {
                "eat","tea","tan","ate","nat","bat"};
        groupAnagrams(strs);
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String key = new String(temp);
            List<String> tlist = map.getOrDefault(key, new ArrayList<>());
            tlist.add(strs[i]);
            map.put(key, tlist);
        }

        return new ArrayList<>(map.values());
    }



//    public static List<List<String>> groupAnagrams(String[] strs){
//
//
//    }
}
