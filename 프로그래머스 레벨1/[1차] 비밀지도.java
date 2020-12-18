// https://programmers.co.kr/learn/courses/30/lessons/17681
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n]; // 한변의 길이만큼의 배열크기를 만들어준다.
        String[] binary_arr1 = new String[n]; // arr1의 이진수를 넣을 배열생성
        String[] binary_arr2 = new String[n]; // arr2의 이진수를 넣을 배열생성
        String temp = "%0" + Integer.toString(n) + "d"; // n크기만큼의 이진수(빈공간에는 0을 넣어준다.)
        
        for(int i=0;i<arr1.length;i++) { // arr1과 arr2의 10진수를 2진수로 바꿔준다.
        	binary_arr1[i] = String.format(temp, Long.parseLong(Long.toBinaryString(arr1[i])));
        	binary_arr2[i] = String.format(temp, Long.parseLong(Long.toBinaryString(arr2[i])));
        }
        
        for(int i=0;i<binary_arr1.length;i++) {
        	answer[i] = ""; // NULL을 빈상태로만들어준다.
        	for(int j=0;j<binary_arr1.length;j++) { 
        		if(binary_arr1[i].charAt(j) == '1' || binary_arr2[i].charAt(j) == '1') { // 둘중에 하나에 1이 있을경우 #을 넣어준다.
        			answer[i] += "#";
        		} else { // 아니면 공백을 넣어준다.
        			answer[i] += " ";
        		}
        	}
        }
        return answer;
    }
}
