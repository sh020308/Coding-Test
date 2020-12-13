// https://programmers.co.kr/learn/courses/30/lessons/42840
import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3 ,2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];
        int max = 0;
        
        for(int i=0;i<answers.length;i++) {
            if(num1[i%num1.length] == answers[i]) {
                count[0]++;
            } 
            if(num2[i%num2.length] == answers[i]) {
                count[1]++;
            }
            if(num3[i%num3.length] == answers[i]) {
                count[2]++;
            }
        }
        
        for(int i=0;i<count.length;i++) {
            if(max < count[i]) {
                max = count[i];
            }
        }
        
        for(int i=0;i<count.length;i++) {
            if(max == count[i]) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}
