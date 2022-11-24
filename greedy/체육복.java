package greedy;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] c_count= new int[n+2]; //체육복 카운트 배열
        for (int i=1; i<c_count.length-1;i++){
            c_count[i]=1;
        }
        
        for (int i : lost){
            c_count[i]-=1;
        }
        for (int i : reserve){
            c_count[i]+=1;
        }
        for (int i=1; i<c_count.length-1; i++){
            if (c_count[i]==0){
                if(c_count[i-1]==2){
                    c_count[i-1]=1;
                    c_count[i]=1;
                }
                else if(c_count[i+1]==2){
                    c_count[i+1]=1;
                    c_count[i]=1;
                }
                else{
                    answer-=1;
                }
            }
        }
        return answer;  
    }
}
