//고급알고리즘 3강 greedy
package 고급알고리즘;

import java.util.*;
public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        long result = str.charAt(0) - '0';  // 첫 번째 문자를 숫자로 변경한 값을 대입
        for (int i = 1; i < str.length(); i++) {    // 두 수 중에서 하나라도 '0' 혹은 '1'인 경우, 곱하기보다는 더하기 수행
            int num = str.charAt(i) - '0';
            if (num <= 1 || result <= 1) {
                result += num;
        }
        else {
            result *= num;
        }
        }
        System.out.println(result);
        }
}
