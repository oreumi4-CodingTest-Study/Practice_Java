import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();

        int i = 0;
        while(i < arr.length){
            if(stk.isEmpty() || (!stk.isEmpty() && stk.peek() < arr[i])){
                stk.push(arr[i++]);
            }else if(!stk.isEmpty() && stk.peek() >= arr[i]){
                stk.pop();
            }
        }

        return stk.stream().mapToInt(item->item).toArray();
        //stk.stream() : Stack<Integer> 객체로부터 스트림을 생성한다
        //mapToInt() : 스트림의 각 요소에 주어진 함수를 적용하고 , 결과를 IntStream 형태로 반환한다!
    }
}