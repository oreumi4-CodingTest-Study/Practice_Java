// [BOJ]수 정렬하기2(2751번) / 실버5


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//힘들게 퀵 정렬을 구현했지만, 퀵정렬의 최악의 시간복잡도 O(n^2)를 저격한 문제라 실패했습니다...
public class SortingNumbers2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(st.nextToken());
        int[] num = new int[T];

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        //팀 정렬(합병 + 힙)을 사용
        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
/*
    //Arrays의 sort(퀵) 정렬을 구현해보자

    //퀵정렬 내부에서 사용할 교체 메서드
    public static void swap(int[] arr, int swapNum1, int swapNum2) {
        int tmp         = arr[swapNum1];
        arr[swapNum1]   = arr[swapNum2];
        arr[swapNum2]   = tmp;
    }
    //중간값을 지정하기 전, 정렬 이후 중앙값 반환 메서드
    public static int sortMiddle(int[] arr, int first, int middle, int last) {
        if(arr[first] >arr[middle]) swap(arr,first,middle);
        if(arr[middle]>arr[last])   swap(arr,middle,last);
        if(arr[first] >arr[middle]) swap(arr,first,middle);
        return middle;
    }
    //퀵정렬 메서드
    public static void quickSort(int[] num,int left, int right) {
        int leftPin = left;
        int rightPin = right;
        int middle = sortMiddle(num, leftPin, (leftPin+rightPin)/2, rightPin);
        //피벗이란 특정 계산을 수행하기 위한 임의의 값
        //처음, 중간, 끝의 중간 값을 기준으로 좌우를 나눈다.
        int pivot = num[middle];

        swap(num, middle, right -1);
        leftPin++;
        rightPin -= 2;

        do {
            while(num[leftPin] < pivot) leftPin++;
            while (num[rightPin] > pivot) rightPin--;
            if(leftPin <= rightPin) swap(num, leftPin++, rightPin--);
        } while (leftPin <= rightPin);

        if(left < rightPin) quickSort(num, left, rightPin);
        if(leftPin < right) quickSort(num, leftPin, right);
    }

 */

