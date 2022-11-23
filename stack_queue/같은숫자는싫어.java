package stack_queue;
import java.util.*;

public class 같은숫자는싫어 {
    public class Solution {
        public int[] solution(int []arr) {
            LinkedList<Integer> answer_list = new LinkedList<>();
            //System.out.println("Hello Java");
            int index=arr[0];
            for (int i : arr){
                if (i!=index){
                    answer_list.add(index);
                    index=i;
                }
            }
            answer_list.add(index);
            int[] answer= new int[answer_list.size()];
            index=0;
            for (int i : answer_list){
                answer[index]=i;
                index++;
            }
            return answer;
        }
    }
}
