// https://programmers.co.kr/learn/courses/30/lessons/12948
class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] temp = new char[phone_number.length()];
        
        for(int i=0; i<phone_number.length();i++)
        {
        	temp[i] = phone_number.charAt(i);
        	if(phone_number.length()-4>i) {
        		answer += "*";
        	}
        	else {
        		answer += temp[i];
        	}
        }
        
        System.out.println(answer);
        return answer;
    }
}
