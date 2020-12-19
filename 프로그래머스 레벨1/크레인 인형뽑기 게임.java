// https://programmers.co.kr/learn/courses/30/lessons/64061
class Solution {
    public int solution(int[][] board, int[] moves) {
		int[] basket = new int[board.length*board[0].length]; // 모든 인형이 다 들어갈 크기의 바구니를 만든다.
		int count = 0; // 바구니갯수 인덱스
		int result = 0; // 사라진 인형 갯수
		
		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<board.length;j++) { // x축 찾기
				if(board[j][moves[i]-1] != 0) { // 보드에 인형이 있을경우에
					basket[count] = board[j][moves[i]-1]; // 바구니에 해당인형을 넣어준다.
					board[j][moves[i]-1] = 0; // 보드의 인형을 삭제한다.
					count++;
					break; // 인형을 하나만 뽑으니 뽑으면 break해준다.
				}
			}
			if(count > 1 && basket[count-1] == basket[count-2]) { // count가 2이상이고 같은 인형이 있을때
				basket[count-1] = 0; // 인형을 없앤다.
				basket[count-2] = 0; // 인형을 없앤다.
				result += 2; // 사라진 인형 두개를 추가한다.
				count -= 2; // 인덱스값 두개를 줄인다.
			}
		}
        return result;
    }
}
