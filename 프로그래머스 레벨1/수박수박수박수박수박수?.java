// https://programmers.co.kr/learn/courses/30/lessons/12922
class Solution {
    public String solution(int n) {
        String su = "수";
        String bak = "박";
        String answer = "";
        
        for(int i=0;i<n;i++) {
            if(i%2 == 0)
            {
                answer += su;
            }
            else
            {
                answer += bak;
            }
            
        }
        return answer;
    }
}
