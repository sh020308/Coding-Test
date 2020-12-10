// https://programmers.co.kr/learn/courses/30/lessons/12933
import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        char[] temp = new char[str.length()];
        
        for(int i=0;i<temp.length;i++) {
            temp[i] = str.charAt(i);
        }
        
        Arrays.sort(temp);
        
        String abc = "";
        
        for(int i=temp.length-1;i>=0;i--) {
            abc += temp[i];
        }
        
        answer = Long.parseLong(abc);
        
        return answer;
    }
}
