import java.util.stream.IntStream;

class Solution {
    public int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(-start,-end_num).map(i->-i).toArray();

        //IntStream.rangeClosed(a, b) 메소드는 a부터 b까지의 연속된 정수를 포함하는 스트림을 생성
        //map 메소드: map(i -> -i) 부분은 스트림의 각 요소에 대해 주어진 함수를 적용
        //toArray 메소드: 마지막으로, toArray()는 스트림을 배열로 변환
    }
}