// https://programmers.co.kr/learn/courses/30/lessons/12939
class Solution {
    public String solution(String s) {
        String[] temp = s.split(" "); // 공백을 기준으로 짤라서 temp 배열에 넣어준다.
        long max = Long.parseLong(temp[0]); // 최댓값
        long min = Long.parseLong(temp[0]); // 최솟값
        
        for(int i=0;i<temp.length;i++) {
            if(max < Long.parseLong(temp[i])) { // 최댓값 구하기
                max = Long.parseLong(temp[i]);
            }
            if(min > Long.parseLong(temp[i])) { // 최솟값 구하기
                min = Long.parseLong(temp[i]);
            }
        }
        return Long.toString(min) + " " + Long.toString(max); //최솟값과 최댓값을 String형으로 반환해준다.
    }
}
