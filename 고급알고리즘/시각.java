//고급알고리즘 5강 구현

package 고급알고리즘;

import java.util.*;

public class 시각 {
    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3)
            return true;
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // H를 입력받기
        int h = sc.nextInt();
        int cnt = 0;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
        // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
