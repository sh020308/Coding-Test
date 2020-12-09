// https://programmers.co.kr/learn/courses/30/lessons/12915
import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String temp = "";
        String[] temp2 = new String[strings.length];
        
        for(int i=0;i<strings.length;i++) {
            strings[i] = strings[i].charAt(n)+strings[i];
        }
        
        Arrays.sort(strings);
        for(int i = 0 ; i < strings.length; i++) {
            temp2[i] = strings[i].substring(1,strings[i].length());
        }

        
        return temp2;
    }
}
