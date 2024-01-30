package question;

import java.util.*;

public class Question49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        Arrays.stream(strs).forEach(str -> {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String orderedString = Arrays.toString(charArray);
            List<String> list = map.getOrDefault(orderedString, new ArrayList<>());
            list.add(str);
            map.put(orderedString, list);
        });

        List<List<String>> res = new ArrayList<>();
        map.forEach((key, value) -> res.add(value));

        return res;
    }
}
