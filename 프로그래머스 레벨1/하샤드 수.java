class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        String temp = Integer.toString(x);
        int temp2 = 0;
        
        
        for(int i=0;i<temp.length();i++) {
            temp2 += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        if(x%temp2 == 0) {
            answer = true;
        }
        return answer;
    }
}
