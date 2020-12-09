import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>(); // 배열 크기를 모르니 arraylist 객체 생성
        int[] answer = {};
        
        for(int i=0;i<numbers.length;i++) {
            for(int j=0;j<i;j++) {
                if(! list.contains(numbers[i]+numbers[j])) { 
                    list.add(numbers[i]+numbers[j]);
                }
            }
        }
        
        Collections.sort(list); // 오름차순 정렬
        
        answer = new int[list.size()]; // list 크기만큼 배열크기 생성
        for(int i=0;i<list.size();i++) {
            answer[i] = list.get(i); // answer배열안에 list값을 넣어준다.
        }
        
        return answer;
    }
}