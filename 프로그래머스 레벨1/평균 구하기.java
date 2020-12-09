// https://programmers.co.kr/learn/courses/30/lessons/12944
class Solution {
    public double solution(int[] arr) {
        int add = 0;
        for(int i=0;i<arr.length;i++) {
            add += arr[i];
        }
        double answer = (double)add/arr.length;
        return answer;
    }
}
