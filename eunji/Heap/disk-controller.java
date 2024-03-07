// 1. 처리중에 디스크 요청들이 들어온 경우
//  ->  수행시간 비교 후 작은 값 먼저 넣어주기 -> pq
//2. 처리 후에 디스크 요청이 들어온 경우
//  a. 요청 시간이 같은 경우 -> pq
//  b. 요청 시간이 다른 경우 -> 먼저 들어온거 처리
import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int now = 0; // 비교 시간
        int sum = 0; // 전체 시간 나중에 나누기 하면 평균
        int answer = 0;
        PriorityQueue<StartNode> sq = new PriorityQueue<>();
        PriorityQueue<TimeNode> tq = new PriorityQueue<>();
        for(int[] element : jobs){
            sq.add(new StartNode(element[0],element[1]));
        }
        
        while(!sq.isEmpty()||!tq.isEmpty()){ 
            while(!sq.isEmpty()){
                if(sq.peek().start>now)break;
                StartNode s = sq.poll();
                tq.add(new TimeNode(s.start ,s.time));
            }
            if(!tq.isEmpty()){
                TimeNode t = tq.poll();
                now += t.time;
                sum += now - t.start;
            }else{
                now = sq.peek().start;
            }
            
        }
        answer = sum/jobs.length;
        return answer;
    }
    
    public class StartNode implements Comparable<StartNode>{
        
        int start, time;
        
        public StartNode(int start,int time){
            this.start = start;
            this.time = time;
        }
        @Override
        public int compareTo(StartNode target){
            if(this.start==target.start){
                return (this.time > target.time)?1:-1;
            }
            return(this.start > target.start)?1:-1; // 바꿔줘야되면 1
        }
    }
    public class TimeNode implements Comparable<TimeNode>{
        
        int start, time;
        
        public TimeNode(int start,int time){
            this.start = start;
            this.time = time;
        }
        @Override
        public int compareTo(TimeNode target){
            if(this.time==target.time){
                return (this.start > target.start)?1:-1;
            }
            return(this.time > target.time)?1:-1; // 바꿔줘야되면 1
        }
    }
}

import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int now = 0; // 비교 시간
        int sum = 0; // 전체 시간 나중에 나누기 하면 평균
        int answer = 0;
        PriorityQueue<StartNode> sq = new PriorityQueue<>();
        PriorityQueue<TimeNode> tq = new PriorityQueue<>();
        for(int[] element : jobs){
            sq.add(new StartNode(element[0],element[1]));
        }
        
        while(!sq.isEmpty()||!tq.isEmpty()){ 
            while(!sq.isEmpty()){
                if(sq.peek().start>now)break;
                StartNode s = sq.poll();
                tq.add(new TimeNode(s.start ,s.time));
            }
            if(!tq.isEmpty()){
                TimeNode t = tq.poll();
                now += t.time;
                sum += now - t.start;
            }else{
                now = sq.peek().start;
            }
            
        }
        answer = sum/jobs.length;
        return answer;
    }
    
    public class StartNode implements Comparable<StartNode>{
        
        int start, time;
        
        public StartNode(int start,int time){
            this.start = start;
            this.time = time;
        }
        @Override
        public int compareTo(StartNode target){
            if(this.start==target.start){
                return (this.time > target.time)?1:-1;
            }
            return(this.start > target.start)?1:-1; // 바꿔줘야되면 1
        }
    }
    public class TimeNode implements Comparable<TimeNode>{
        
        int start, time;
        
        public TimeNode(int start,int time){
            this.start = start;
            this.time = time;
        }
        @Override
        public int compareTo(TimeNode target){
            if(this.time==target.time){
                return (this.start > target.start)?1:-1;
            }
            return(this.time > target.time)?1:-1; // 바꿔줘야되면 1
        }
    }
}
