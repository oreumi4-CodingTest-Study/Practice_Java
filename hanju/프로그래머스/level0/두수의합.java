import java.math.BigInteger;
//정수의 크기에 '제한'을 두지 않아서 매~우 큰 값을 다룰 수 있는 클래스.
//정수형으로의 타입 변환이 필요하지 않고, 문자열 형태로 숫자를 입력받아 내부적으로 해당 문자열을 정수로 변환해 처리한다

class Solution {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);//+,-,* 같은 연산자를 사용하지 않고 각각의 메서드를 사용해야 한다

        String answer = sum.toString();
        return answer;
        //BigInteger클래스는 처음봐서 이걸 실생활에서 다루나?... 싶어서 찾아봤는데
        //암호학,정밀 계산,데이터 처리 등에 BigInteger를 사용한다고 한다.
    }
}