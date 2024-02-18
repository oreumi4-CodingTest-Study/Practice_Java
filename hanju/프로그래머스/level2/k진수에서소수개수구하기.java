import java.util.ArrayList;

class Solution {
    static ArrayList<String> arr = new ArrayList<>();
    static int answer;
    public int solution(int n, int k) {
        change(n,k);
//        Collections.reverse(arr); 굳이 안해도 된다

        String str = "";
        for(int i = arr.size() - 1; i >= 0; i--){
            str += arr.get(i); //str에 직접 문자열을 더하는거말고 다른방법은 없을까?.. 메모리자원을 많이쓸 것 같은 느낌
        }

        divide(str);

        return answer;
    }

    public void change(int n, int k){//k진수로 변환해주는 메서드
        if(n < k){//종료조건
            arr.add(Integer.toString(n));
            return;
        }

        int r = n % k;
        arr.add(Integer.toString(r));
        change(n / k, k);
    }

    public boolean getDecimal(long num){//소수인지 판별하는 메서드
        if(num == 1){
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){ //Math.pow()와 헷갈리지 말자! 소수 계산때 Math.sqrt()까지 범위를 잡아야 시간초과안뜬다!
            if(num % i == 0){
                return false;
            }
        }

        return true; //소수가 맞다
    }

    public void divide(String num){//0을 기준으로 숫자를 나눈다
        int start = 0;

        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '0'){
                String number = num.substring(start,i);
                start = i + 1;

                if(number.equals(""))continue;
                long getNumber = Long.parseLong(number);

                if(getDecimal(getNumber)){
                    answer++;
                }
            }else if(i == num.length() - 1){
                String number = num.substring(start,i+1);

                if(getDecimal(Long.parseLong(number))){
                    answer++;
                }
            }
        }
    }

}