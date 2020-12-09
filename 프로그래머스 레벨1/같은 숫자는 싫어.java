 // https://programmers.co.kr/learn/courses/30/lessons/12906
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int count = 10;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != count) {
                list.add(arr[i]);
                count = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size();i++) {
            answer[i]=list.get(i);
        }
        

        return answer;
    }
}
