package heap;
import java.util.*;

public class 더맵게 {
    
    class Solution {
        public int solution(int[] scoville, int K) {
            int answer = 0;
            PriorityQueue<Integer> heap= new PriorityQueue<>();
            for (int i=0; i<scoville.length; i++){
                heap.add(scoville[i]);
            }
            int a;
            while (heap.size()>1){
                a=heap.poll();
                if (a>=K){
                    return answer;
                }
                a+=2*heap.poll();
                heap.add(a);
                answer+=1;
            }
            if (heap.poll()>=K) return answer;
            return -1;
        }
    }
}
