// https://programmers.co.kr/learn/courses/30/lessons/67256
import java.lang.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] Keypad = {{-1, 0, -2}, {7, 8, 9}, {4, 5, 6}, {1, 2, 3}}; // 키패드의 위치를 2차원 배열로 설정
        int left_hand_j = 0; // 왼손 x축 인덱스
        int left_hand_z = 0; // 왼손 y축 인덱스(*부터 시작)
        int right_hand_j = 0; // 오른손 x축 인덱스
        int right_hand_z = 2; // 오른손 y축 인덱스(#부터 시작)
        
        for(int i=0;i<numbers.length;i++) {
            switch(numbers[i]) {
                case 1:
                    left_hand_j = 3;
                    left_hand_z = 0;
                    answer += "L";
                    break;
                case 4:
                    left_hand_j = 2;
                    left_hand_z = 0;
                    answer += "L";
                    break;
                case 7:
                    left_hand_j = 1;
                    left_hand_z = 0;
                    answer += "L";
                    break;
                case 3:
                    right_hand_j = 3;
                    right_hand_z = 2;
                    answer += "R";
                    break;
                case 6:
                    right_hand_j = 2;
                    right_hand_z = 2;
                    answer += "R";
                    break;
                case 9:
                    right_hand_j = 1;
                    right_hand_z = 2;
                    answer += "R";
                    break; // 147은 왼손 369는 오른손 고정이니 해당 위치의 인덱스값을 줌
                case 2:
                case 5:
                case 8:
                case 0: //2580일때
                    for(int j=0;j<Keypad.length;j++) { // x축만큼 반복
                        for(int z=0;z<Keypad[j].length;z++) {  // y축만큼 반복
                            if(Keypad[j][z] == numbers[i]) { // x축 y축의 자리 찾기
                                int temp = Math.abs(j-left_hand_j) + Math.abs(z-left_hand_z);
                                int temp2 = Math.abs(j-right_hand_j) + Math.abs(z-right_hand_z);
                                // 2580의 x y축보다 클수도 있으니 빼고나서 절댓값으로 더해서 크기를 비교한다.
                                if(temp > temp2) { // 오른손이 더 가까우면
                                    right_hand_j = j;
                                    right_hand_z = z;
                                    answer += "R";
                                    break;
                                } else if(temp < temp2) { // 왼손이 더 가까우면
                                    left_hand_j = j;
                                    left_hand_z = z;
                                    answer += "L";
                                    break;
                                } else { // 거리가 같으면
                                    if("left".equals(hand)) { // 왼손잡이일때
                                        left_hand_j = j;
                                        left_hand_z = z;
                                        answer += "L";
                                        break;
                                    } else { // 오른손잡이일때
                                        right_hand_j = j;
                                        right_hand_z = z;
                                        answer += "R";
                                        break;
                                    }
                                }
                            }
                        }
                    }
            }
        }
        return answer;
    }
}
