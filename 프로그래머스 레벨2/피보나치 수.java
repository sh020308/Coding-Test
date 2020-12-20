// https://programmers.co.kr/learn/courses/30/lessons/12945
class Solution {
    public int solution(int n) {
        long temp = 1; // 지금값
        long primary = 0; // 이전값
        
        for(int i=1;i<n;i++) { // 피보나치 수 구하는 반복문
        	long temps = temp;
            temp += primary%1234567;
            primary = temps%1234567;
        }
        temp %= 1234567; // long형의 상태에서 1234567나누기의 나머지를 구해주고 리턴해준다.
        return (int)temp;
    }
}
