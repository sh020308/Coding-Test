// https://programmers.co.kr/learn/courses/30/lessons/42576
import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        /*for(int i=0;i<completion.length;i++) {
            for(int j=0;j<participant.length;j++) {
                if(completion[i].equals(participant[j])) {
                    participant[j] = "";
                    break;
                } 
            }
        }
        
        for(int i=0;i<participant.length;i++) {
            if(! "".equals(participant[i])) {
                answer += participant[i];
            }
        }*/
        
		HashMap<String, Integer> map = new HashMap<>();

		for (String part : participant) {
			map.put(part, map.getOrDefault(part, 0) + 1);
		}
		for (String comp : completion) {
			map.put(comp, map.get(comp) - 1);
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 0) {
				answer = entry.getKey();
				break;
			}
		}

        return answer;
    }
}
