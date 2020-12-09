// https://programmers.co.kr/learn/courses/30/lessons/12910
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i] % divisor == 0) {
                count++;
            }
            else {
                arr[i] = -1;
            }
        }
        
        int[] answer = new int[count];

        
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != -1) {
                list.add(arr[i]);
            }
        }
        
        Collections.sort(list);
        
        
        if(count != 0) {
            for(int i=0;i<answer.length;i++) {
                answer[i] = list.get(i).intValue();
            }
        }
        
        if(count == 0) {
            int[] answer2 = {-1};
            return answer2;
        }
        
        return answer;
    }
}
