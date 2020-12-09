// https://programmers.co.kr/learn/courses/30/lessons/12940
class Solution {
    public int[] solution(int n, int m) {
        int i = 1;
        int max = 0;
        int min = 0;
    
        while(i<=n && i<=m) {
            if(n%i == 0 && m%i == 0) {
                min = i;
            }
            i++;
        }
        
        max = n*m/min;
        
        int[] answer = {min, max};
        return answer;
    }
}
