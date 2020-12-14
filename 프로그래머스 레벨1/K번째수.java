// https://programmers.co.kr/learn/courses/30/lessons/42748
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        for(int i=0;i<commands.length;i++) { // 반환할 int형 배열의 크기는 commands의 1차원 배열이랑 같다.
            int[] temp = new int[commands[i][1]-commands[i][0]+1]; // 배열의 크기는 인덱스1에서 인덱스0까지 자른 크기
            
            for(int j=0;j<temp.length;j++) {
                temp[j] = array[commands[i][0]+j-1]; // 인덱스 기준이니 -1해준다.
            }
            Arrays.sort(temp); // 오름차순 정렬
            
            answer[i] = temp[commands[i][2]-1]; // 마찬가지로 인덱스 기준이니 -1해준다.
        }
        
        
        return answer;
    }
}
