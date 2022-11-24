//고급알고리즘 5강 구현
package 고급알고리즘;

import java.util.*;
public class 상하좌우 {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    String plans = sc.nextLine(); 
    int x=1, y = 1;
    // L, R, U, D에 따른 이동 방향
    int[] dx = {0, 0, -1, 1};
    int[] dy = {-1, 1, 0, 0};
    char[] moveTypes = {'L', 'R', 'U', 'D'};
    // 이동 계획을 하나씩 확인하기
    int nx = 0, ny = 0;
    for (int i = 0; i < plans.length(); i++ ) {
        char plan = plans.charAt(i);
        for (int j =0; j < moveTypes.length; j++) {
            if ( plan == moveTypes[j] ) {
                nx = x + dx[j];
                ny = y + dy[j];
            //System.out.println(" nx="+nx+" ny="+ny);
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx; y = ny; 
            } 
        }
        System.out.println(x+ " " + y);
    }       
}
