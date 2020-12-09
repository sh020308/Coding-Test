// https://programmers.co.kr/learn/courses/30/lessons/12921
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] temp = new int[n+1];
        
        for(int i=2;i<=n;i++) {
            temp[i] = i;
        }
        
        for(int i=2;i<=n;i++) {
            if(temp[i] == 0) {
                continue;
            }
            for(int j = i*2;j<=n;j+=i) {
                temp[j] = 0;
            }
        }
        
        for(int i=0;i<temp.length;i++) {
            if(temp[i] != 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
