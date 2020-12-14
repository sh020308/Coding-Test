// https://programmers.co.kr/learn/courses/30/lessons/68935
class Solution {
    public int solution(int n) {
		int count = 0; // 자리수 계산
		int result = 0; // 반환해줄 결과값
		int a=1; // 다시 10진법으로 계산할때 쓸 변수
		String su = ""; // 3진법으로 계산할때 쓸 string형
		
		for(int i=1;i<=n;i*=3) { // 3진법 자리수 계산
			count++;
		}
		
		int[][] temp = new int[count][2]; // 2차원 *2까지 저장해주는 2차원 배열 생성
		count = 0; // 0으로 대입
		
		for(int i=1;i<=n;i*=3) { // 2차원 배열에 0에는 i값 1에는 i*2값을 넣어준다.
			temp[count][0] = i;
			temp[count][1] = i*2;
			count++;
		}
		
		for(int i=temp.length-1;i>=0;i--) { // temp[i][1]보다 크면 2를 ...[0]보다 크면 1을 아니면 0을 더해준다.
			if(temp[i][1] <= n) {
				su += "2";
				n -= temp[i][1];
			}
			else if(temp[i][0] <= n) {
				su += "1";
				n -= temp[i][0];
			}
			else {
				su += "0";
			}
		}

		
		for(int i=1;i<=su.length();i++) {
			result += Integer.parseInt(String.valueOf(su.charAt(i-1)))*a; // char형을 int형으로 변환후 더해준다.
			a*=3;
		}
		
		
		return result;
	}
}
