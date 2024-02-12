import java.util.*;

class Solution {
    static Queue<String> queue = new LinkedList<String>();
    static boolean[] visited;
    
    public static int bfs(String target, String[] words){
        int level = 0;
        while(!queue.isEmpty()){
            for(int j = 0; j < queue.size(); j++){
                String begin = queue.poll();
                if(begin.equals(target)){
                    return level;
                 }
                for(int k = 0; k < words.length; k++){
                    int cnt = 0;
                    for(int i = 0; i < words[k].length(); i++){
                        if(begin.charAt(i) != words[k].charAt(i)){
                            cnt++;
                        }
                    }
                    if(cnt==1&&visited[k]!=true){
                        queue.add(words[k]);
                        visited[k] = true;
                    }
                
                }
            }
            level++;
            
        }
        return 0;   
    }
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        visited = new boolean[words.length];
        queue.add(begin);
        answer = bfs(target, words);
        
        
        return answer;
    }
}
