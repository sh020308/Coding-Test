// https://programmers.co.kr/learn/courses/30/lessons/68935
class Solution {
    public int solution(int n) {
		int count = 0;
		int result = 0;
		int a=1;
		String su = "";
		String temp2 = "";
		
		for(int i=1;i<=n;i*=3) {
			count++;
		}
		
		int[][] temp = new int[count][2];
		count = 0;
		
		for(int i=1;i<=n;i*=3) {
			temp[count][0] = i;
			temp[count][1] = i*2;
			count++;
		}
		
		for(int i=temp.length-1;i>=0;i--) {
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
			result += Integer.parseInt(String.valueOf(su.charAt(i-1)))*a;
			a*=3;
		}
		
		
		return result;
	}
}
