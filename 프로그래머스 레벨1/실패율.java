// https://programmers.co.kr/learn/courses/30/lessons/42889
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N]; // 배열의 크기는 무조건 n이기에 n만큼 설정해준다.
        double[][] count = new double[N][2]; //2차원배열의 첫번째배열엔 실패율을 두번째배열엔 몇스테이지인지
        int[] count_d = new int[N]; // 무슨스테이지를 몇명이 도전했는지
        
        for(int i=0;i<stages.length;i++) { //스테이지를 클리어 못한사람 count
            if(stages[i] <= N) {
                count[stages[i]-1][0]++;
            }
        }

        for(int i=0;i<count_d.length;i++) { //스테이지를 몇명이 도전했는지 count
            for(int j=0;j<stages.length;j++) {
            	if(stages[j] >= i+1) {
            		count_d[i]++;
            	}
            }
        }
        
        for(int i=0;i<count.length;i++) {
        	count[i][0] /= count_d[i]; // 클리어못한사람 / 도전한사람 = 실패율
        	count[i][1] = i+1; // 몇스테이지인지
        }
        
       tempsort(count); // 실패율을 내림차순하고 값이 0이거나 같으면 스테이지순으로 오름차순 하는 메소드
       
       for(int i=0;i<count.length;i++) { //스테이지를 int형변환후 가져온다.
    	   answer[i] = (int)count[i][1];
       }
        return answer;

	}
	
	public static void tempsort(double[][] temp) {
		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i][0] < temp[j][0]) {
					double temps = temp[i][0];
					double temps_1 = temp[i][1];
					temp[i][0] = temp[j][0];
					temp[i][1] = temp[j][1];
					temp[j][0] = temps;
					temp[j][1] = temps_1;
				} else if(temp[i][1] > temp[j][1]) {
					double temps = temp[i][0];
					double temps_1 = temp[i][1];
					temp[i][0] = temp[j][0];
					temp[i][1] = temp[j][1];
					temp[j][0] = temps;
					temp[j][1] = temps_1;
				}
			}
		}
	}
}
