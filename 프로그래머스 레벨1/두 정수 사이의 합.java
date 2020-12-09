// https://programmers.co.kr/learn/courses/30/lessons/12912
class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int big = 0;
        int small = 0;
        
        if(a > b) {
            big = a;
            small = b;
        }
        else if(a < b) {
            small = a;
            big = b;
        }
        else {
            small = a;
            big = b;
        }
        
        for(int i=small;i<=big;i++)
        {
            answer+= i;
        }
        
        return answer;
    }
}
