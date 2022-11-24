package 완전탐색;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int m=0;
        int n=0;
        for (int[] i: sizes){
            int mm;
            int nn;
            if (i[0]>i[1]){
                mm=i[0];
                nn=i[1];
            }
            else{
                mm=i[1];
                nn=i[0];
            }
            if(mm>m){
                m=mm;
            }
            if(nn>n){
                n=nn;
            }
        }
        return m*n;
    }
}
