// https://programmers.co.kr/learn/courses/30/lessons/12934
class Solution {
    public long solution(long n) {
        long answer = -1;
        
        if(n == 1) {
            answer = 4;
        }

        for(long i=0;i<n/2+1;i++)
        {
            if(i*i == n)
            {
                answer = (i+1)*(i+1);
                break;
            }
        }
        
        return answer;
    }
}
