package 기업코테;

import java.util.*;

public class 코나아이 { //행복한 수
    public int isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)) {
            set.add(n);
            
            int temp = n;
            n=0;
            
            while(temp != 0) {
                n += (temp % 10) * (temp % 10);
                temp /= 10;
            }
            
            if(n == 1)
                return set.size()-1;
        }
        return -1;
    }
}
