// https://programmers.co.kr/learn/courses/30/lessons/12930
class Solution {
  public String solution(String s) {
      String answer = "";
      String temp[] = s.split("");
      int count = 0;
      
      for(int i=0;i<temp.length;i++){
          if(" ".equals(temp[i])){
             count = 0;
          }
          else {
                if(count % 2 == 0){
                    count++;
                    temp[i] = temp[i].toUpperCase();
                 }
                else{
                    count++;
                    temp[i] = temp[i].toLowerCase();
                }
          }
          answer += temp[i];
      }
      
      return answer;
  }
}
