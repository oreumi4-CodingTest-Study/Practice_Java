package M01.W3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2108 { // 통계학
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   // N은 홀수
        double mean;        // 산술평균 : N개의 수들의 합을 N으로 나눈 값
        int median;         // 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        int mostFrequent = 0;   // 최빈값 : N개의 수들 중 가장 많이 나타나는 값
        int range;          // 범위 : N개의 수들 중 최댓값과 최솟값의 차이

        int[] nums = new int[N];
        int[] set = new int[N]; // 입력받은 숫자 집합
        int[] count = new int[N];   // 각 숫자 개수

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt(); // N개 만큼 정수 입력받음
            count[i] = 0;   // count 초기화
        }
        Arrays.sort(nums);  // 정렬
        set[0] = nums[0];

        double sum = 0; // 입력값의 합
        int j = 0;
        for (int i = 0; i < N; i++) {
            sum += nums[i];
            if (set[j] != nums[i]) {
                j++;
                set[j] = nums[i];
            }
            count[j]++;
        }

        int maxCount = 0;
        for (int i=j; i>=0; i--){   // 큰 값부터 확인
            if (maxCount <= count[i]){
                maxCount = count[i];
                mostFrequent = set[i];   // 카운트 높은 숫자 찾기
            }
        }
        for (int i=0; i<=j; i++){   // 최빈값이 여러개면 두번째로 작은 값 찾기
            if (count[i] == maxCount && mostFrequent != set[i]){
                mostFrequent = set[i];
                break;
            }
        }
        mean = sum / N; // 산술평균

        median = nums[(int) (N / 2)];    // 중앙값

        range = nums[N - 1] - nums[0];    // 범위

        // 반올림 사전작업
        if (mean >= 0) {
            mean += 0.5;
        } else{
            mean -= 0.5;
        }
        System.out.println((int)mean);
        System.out.println(median);
        System.out.println(mostFrequent);
        System.out.println(range);
    }
}
