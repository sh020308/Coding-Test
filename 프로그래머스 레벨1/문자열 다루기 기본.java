// https://programmers.co.kr/learn/courses/30/lessons/12918
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        boolean number = true;
        
        for(int i=0; i<s.length();i++) {
			char chr = s.charAt(i);
            if(number == true)
            {
			number = Character.isDigit(chr);
            }
		}
        
        if(s.length() == 4 || s.length() == 6)
        {
            if(number == true)
            {
                answer = true;
            }
            
        }
        return answer;
    }
}
