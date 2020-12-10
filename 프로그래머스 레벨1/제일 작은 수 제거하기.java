// https://programmers.co.kr/learn/courses/30/lessons/12935
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int minnum = 0;
        
        if(arr.length == 1) {
            int[] mins = {-1};
            return mins;
        }
        else {
            int[] temp = new int[arr.length-1];
            for(int i=0;i<arr.length;i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    minnum = i;
                }
            }
            for(int i=0;i<temp.length;i++) {
                if(minnum > i) {
                    temp[i] = arr[i];
                }
                else {
                    temp[i] = arr[i+1];
                }
            }
            answer = temp;
        }
        
        return answer;
    }
}
