package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        sentence = sentence.toLowerCase(Locale.ROOT);
        StringTokenizer st = new StringTokenizer(sentence, "(' ')|('.')|(',')");
        while (st.hasMoreTokens()){
            String word = st.nextToken();
            if (word.isEmpty()) break;
            if (!map.containsKey(word)){
                map.put(word, 1);
            } else {
                int cou = map.get(word);
                map.replace(word, cou + 1);
            }
        }
        return map;
    }
}
