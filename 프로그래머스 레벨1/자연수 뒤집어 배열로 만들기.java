// https://programmers.co.kr/learn/courses/30/lessons/12932
class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String temp = Long.toString(n);
        
        answer = new int[temp.length()];
        for(int i=temp.length();i>0;i--) {
            answer[temp.length()-i] = Integer.parseInt(String.valueOf(temp.charAt(i-1))); 
        }
        
        return answer;
    }
}
