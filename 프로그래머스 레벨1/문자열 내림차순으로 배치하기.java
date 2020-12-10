// https://programmers.co.kr/learn/courses/30/lessons/12917
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        //소문자
        char[] temp = new char[s.length()];
        ArrayList<Character> list2 = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
            if(Character.isLowerCase(s.charAt(i)))
            {
                list2.add(s.charAt(i));
            }
        }
        
        list2.sort(null);
        
        for(int i=list2.size()-1;i>=0;i--) {
            answer += list2.get(i);
        }
        
        //대문자
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0;i<s.length();i++) {
            if(Character.isUpperCase(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }
        
        list.sort(null);
        
        for(int i=list.size()-1;i>=0;i--) {
            answer += list.get(i);
        }
        
        return answer;
    }
}
