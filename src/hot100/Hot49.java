package hot100;

import java.util.*;

public class Hot49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = ans.getOrDefault(key, new ArrayList<>());
            list.add(str);
            ans.put(key, list);
        }

        return new ArrayList<>(ans.values()) ;
    }
}
