class Solution {
    static int[] d = {781,156,31,6,1};
    public int solution(String word) {
        // 1 : 781
        // 2 : 156
        // 3 : 31
        // 4 : 6
        // 5 : 1
        int[] array = new int[5];
        int len = word.length();
        int answer = word.length(); // 초기 길이에서 증가율 구하기
        int[] arr = new int[5];
        for(int i = 0; i <len; i++){
            char c = word.charAt(i);
            switch(c){
                case 'A':
                    arr[i] = 0; //초기값 A부터 시작하니까 0
                    break;
                case 'E':
                    arr[i] = 1;
                    break;
                case 'I':
                    arr[i] = 2;
                    break;
                case 'O':
                    arr[i] = 3;
                    break;
                case 'U':
                    arr[i] = 4;
                    break;
            }
        }
        //[1][2][3][4][5]
        for(int i=0; i< word.length();i++){
            answer += d[i]*arr[i];
        }
    
        return answer;
    }
}
