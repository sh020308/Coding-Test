// https://programmers.co.kr/learn/courses/30/lessons/12903
class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = s.length()/2;
        
        if(s.length()%2 == 0)
        {
            answer += s.charAt(temp-1);
            answer += s.charAt(temp);
        }
        else
        {
            answer += s.charAt(temp);
        }
        
        return answer;
    }
}
