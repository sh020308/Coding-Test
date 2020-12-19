// https://programmers.co.kr/learn/courses/30/lessons/12951
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] temp = s.split(" "); // 공백 기준으로 짤라서 단어마다 배열을 만든다.
        
        if(s.substring(s.length() - 1, s.length()).equals(" ")) { // 맨 끝자리에 공백이 있으면 공백을 넣어준다.
            temp[temp.length-1] += " ";
        }
        
        for(int i=0;i<temp.length;i++) {
            for(int j=0;j<temp[i].length();j++) {
                if(j == 0) {
                    if(! Character.isDigit(temp[i].charAt(0))) { // 첫자리가 숫자가 아닐때는 대문자로 변환
                        answer += Character.toUpperCase(temp[i].charAt(0));
                    } else {
                        answer += temp[i].charAt(0); // 숫자면 그대로 +해준다.
                    }
                } else {
                    answer += Character.toLowerCase(temp[i].charAt(j)); // 나머지 문자열은 소문자로 변환
                }
            }
            if(i < temp.length-1) { // 단어마다 공백을 넣어준다.
                answer += " "; 
            }
        }
        
        return answer;
    }
}
