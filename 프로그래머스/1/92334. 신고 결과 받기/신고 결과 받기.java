import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String,Integer> result = new HashMap<>();
        
        for(int i=0;i<id_list.length;i++){
            result.put(id_list[i],0);
        }
        
        // 중복된 신고를 제거하기 위해 HashSet에 저장
        HashSet<String> set = new HashSet<>();
        for (String r : report) {
            set.add(r);
        }
        
        // 중복 제거된 신고를 처리
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String r : set) {
            String[] split = r.split(" ");
            countMap.put(split[1], countMap.getOrDefault(split[1], 0) + 1);
        }
        
        // k번 이상 신고된 사용자를 찾아서 criminal 리스트에 추가
        List<String> criminal = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() >= k) {
                criminal.add(entry.getKey());
            }
        }
        
        // 결과 메일을 받을 사용자의 결과 계산
        for (String r : set) {
            String[] split = r.split(" ");
            if (criminal.contains(split[1])) {
                result.put(split[0], result.getOrDefault(split[0], 0) + 1);
            }
        }
        
        // 결과 배열에 결과 저장
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = result.get(id_list[i]);
        }
        
        return answer;
    }
}