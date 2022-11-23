package 해시;

import java.util.HashMap;

public class 완주하지못한선수 {
    
    class Solution {
        public String solution(String[] participant, String[] completion) {
            HashMap<String, Integer> p_count= new HashMap<>();
            String answer="";
            for (String name : participant){
                p_count.put(name, p_count.getOrDefault(name, 0) + 1);
            }
            for (String name : completion){
                p_count.put(name, p_count.get(name)-1);
            }
            for (String name : p_count.keySet()){
                if (p_count.get(name)==1){
                    answer=name;
                    break;
                }
            }
            return answer;
        }
    }
}
