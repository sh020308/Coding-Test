// https://programmers.co.kr/learn/courses/30/lessons/12926
class Solution {
    public String solution(String s, int n) {
    String answer = "";
    int temp = 0;
        
        for(int i=0;i<s.length();i++) {
            temp = (int)s.charAt(i);
            
            if(Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
                for(int j=0;j<n;j++) {
                    temp++;
                    if(temp > 90 && Character.isUpperCase(s.charAt(i))) {
                        temp -= 26;
                    } else if(temp > 122 && Character.isLowerCase(s.charAt(i))) {
                        temp -= 26;
                    }
            }
                answer += (char)temp;
            }
            else {
                answer += s.charAt(i);
            }
        }
    

        return answer;
    }
}
