import java.util.*;

 class SolutionHindex {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> cList = new ArrayList<>();
        for(Integer element : citations){
            cList.add(element);
        }
        Collections.sort(cList);
        Collections.reverse(cList);
        // 0 1 3 3 5 6 -> 6개 
        // 6 5 3 3 1 0
        // 1 2 3 4 5 6
        int len = cList.size();
        for(int i=0; i<len; i++){
            if(cList.get(i) > i){
                answer = i+1;
            }
        }
        return answer;
    }
}
