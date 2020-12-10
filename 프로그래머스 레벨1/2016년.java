// https://programmers.co.kr/learn/courses/30/lessons/12901
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int week_num = 5;
        int temp_month = 0;
            
        for(int i=1;i<=a;i++) {
            switch(i) {
                case 2:
                    temp_month = 29;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    temp_month = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    temp_month = 30;
                    break;
            }
            for(int j=1;j<=temp_month;j++) {
                if(i == a && j == b) {
                    answer += week[week_num];
                    break;
                }
                if(week_num < 6) {
                    week_num++;
                } else {
                    week_num = 0;
                }
            }
        }
            
        return answer;
    }
}
