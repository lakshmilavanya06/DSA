// Problem:sort-characters-by-frequency
// Link: https://leetcode.com/problems/sort-characters-by-frequency/
// Topic: strings
// Difficulty: medium
// Date Solved: 03-07-2025
//time complexity:O(nlog n)
//time taken:30 mins
package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortByFreq {
    public String frequencySort(String s) {
        Map<Character,Integer> Lavs=new HashMap<>();
        for(char c:s.toCharArray()){
            Lavs.put(c,Lavs.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> aks=new PriorityQueue<>(
            (a,b)->Lavs.get(b)-Lavs.get(a));
        aks.addAll(Lavs.keySet());
        StringBuilder res=new StringBuilder();
        while(!aks.isEmpty()){
            char c=aks.poll();
            int f=Lavs.get(c);
            for(int i=0;i<f;i++){
                res.append(c);
            }
        }
        return res.toString();
    }
}
