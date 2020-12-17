// https://programmers.co.kr/learn/courses/30/lessons/17681
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int count = 0;
        
        for(int i=0;i<dartResult.length();i++) { // 숫자가 몇번 있는지 카운트해주는 for문
            if(dartResult.charAt(i) == '0') { // 0일경우 10인지 체크
            	if(i > 0) { // 0이 첫번째 자리가 아니라면
	                if(dartResult.charAt(i-1) != '1') { // 바로 앞문자열이 1인지(10인지) 카운트
	                    count++;
	                }
            	} else { //0이 첫번째자리면 앞에는 아무것도 없으니 카운트
            		count++;
            	}
            }
            else if(Character.isDigit(dartResult.charAt(i))) { // 숫자일경우 카운트
                count++;
            }
        }
        
        int[] result = new int[count+1]; // S D T 계산해서 넣어줄 배열 생성
        count = 0; // 새롭게 쓸 카운트 초기화
        
        for(int i=0;i<dartResult.length();i++) {
            char temp = dartResult.charAt(i);
           if(Character.isDigit(temp)){ // 숫자일때
                char temp2 = dartResult.charAt(i+1);
               
                if(equal("0", temp)) { //10일경우
                	if(i>0) {
                		if(equal("1", dartResult.charAt(i-1))) {
                			temp = ':'; // 9다음의 아스키코드인 :을 준다.
                		}
                	} 
                }
                if(equal("S", temp2)) { // S면 그냥 더해준다.
                    result[count] += temp-48; // char형의 숫자-48하면 숫자가나온다.
                    count++; // 다음 배열에 저장해줘야하므로 +1해준다.
                } else if(equal("D", temp2)) { // D면 2제곱
                    result[count] += (temp-48) * (temp-48);
                    count++;
                } else if(equal("T", temp2)) { // T면 3제곱
                    result[count] += (temp-48) * (temp-48) * (temp-48);
                    count++;
                }
            } else if(equal("#", temp)) { // #일경우 이전에 계산해줬던 값 * -1을 해준다.
                result[count-1] *= -1;
            } else if(equal("*", temp)) { // *일경우 이전과 전전에 계산해줬던값들을 *2해준다.
                result[count-1] *= 2;
                if(count > 1) { // 전전값이 있을경우만 *2해준다.
                	result[count-2] *= 2;
                }
            }
        }
        
        for(int i=0;i<result.length;i++) { // 나온값들을 다 더해준다.
            answer += result[i];
        }
        return answer;
    }
    
    public static boolean equal(String n, char m) {
        return n.equals(Character.toString(m));
    }
}
