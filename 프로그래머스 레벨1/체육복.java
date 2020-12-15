// https://programmers.co.kr/learn/courses/30/lessons/42862
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] temp = new int[n]; // 전체 학생의 수 만큼 임시 배열을 만들어준다.
		
		for(int i=0;i<reserve.length;i++) { // 여벌 체육복을 가져왔던 학생들은 두개 가져왔다고 해준다.
			temp[reserve[i]-1] = 2;
		}
		
		for(int i=0;i<lost.length;i++) { // 체육복을 도난당한 학생들은 한개씩 잃는다.
			temp[lost[i]-1] -= 1;
		}
		
		for(int i=0;i<temp.length;i++) { 
			if(temp[i] == -1) { // 잃은 학생들이 빌리려면
				if(i == 0) { // 1번 학생은 앞번호가 없어서 못빌리니 조건문을 추가해준다.
					if(temp[i+1] > 1) { // 뒷번호가 여벌의 체육복이 있으면 빌린다.
						temp[i] += 1;
						temp[i+1] -= 1;
					}
				}
				else if(i == temp.length-1) { // 마찬가지로 마지막 학생도 뒷번호가 없어서 못빌리니 조건문을 추가해준다.
					if(temp[i-1] > 1) { // 앞번호가 여벌의 체육복이 있으면 빌린다.
						temp[i] += 1;
						temp[i-1] -= 1;
					}
				}
				else { // 맨앞번호도 맨뒷번호도 아닌 학생들
					if(temp[i+1] > 1) { // 앞번호에 여벌의 체육복이 있으면 빌린다.
						temp[i] += 1;
						temp[i+1] -= 1;
					}
					else if(temp[i-1] > 1) { // 뒷번호에 여벌의 체육복이 있으면 빌린다.
						temp[i] += 1;
						temp[i-1] -= 1;
					}
				}
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i] != -1) { // 체육복이 있는 학생들을 체크해준다.
				answer++;
			}
		}
        
        return answer;
    }
}
