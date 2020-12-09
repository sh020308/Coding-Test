// https://programmers.co.kr/learn/courses/30/lessons/12943
class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;
        
        while(true) {
            if(answer == 500) {
                return answer = -1;
            }
            if(n == 1)
            {
                return answer;
            }
            else if(n != 1)
            {
                if(n % 2 == 0) {
                    n /= 2;
                    answer++;
                }
                else {
                    n = (n*3)+1;
                    answer++;
                }
            }
        }
    }
}
