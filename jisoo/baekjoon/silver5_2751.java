import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class silver5_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
//        int[] nums = new int[n];
//        List<Integer> nums = new ArrayList<>(n);
        boolean[] nums = new boolean[2000001];

        for (int i = 0; i < n; i++) {
//            nums[i] = Integer.parseInt(br.readLine());
            nums[Integer.parseInt(br.readLine())+1000000] = true;
        }
        br.close();

//        Sort.merge(nums);

//        Collections.sort(nums);
//        for (boolean num : nums){
//            sb.append(num).append("\n");
//        }
        for (int i = 0; i < 2000001; i++) {
            if(nums[i]){
                sb.append(i-1000000).append("\n");
            }
        }

        System.out.println(sb);
    }
}

//class Sort{
//    public static void merge(int[] nums){
//        if(nums.length < 2){
//            return;
//        }
//
//        int middle = nums.length/2;
//        int[] left = new int[middle];
//        int[] right = new int[nums.length-middle];
//
//        for (int i = 0; i < left.length; i++) {
//            left[i] = nums[i];
//        }
//
//        for (int i = 0; i < right.length; i++) {
//            right[i] = nums[middle+i];
//        }
//
//        merge(left);
//        merge(right);
//        sort(nums,left,right);
//    }
//
//    public static void sort(int[] nums, int[] left, int[] right){
//
//        int i = 0, j = 0, k = 0;
//        for (; k < nums.length; k++) {
//            if(i >= left.length || j >= right.length){
//                break;
//            }
//            if(left[i] <= right[j]){
//                nums[k] = left[i++];
//            }else{
//                nums[k] = right[j++];
//            }
//        }
//
//        if(i < left.length){
//            for (; i < left.length; i++) {
//                nums[k++] = left[i];
//            }
//        }
//
//        if(j < right.length){
//            for (; j < right.length; j++) {
//                nums[k++] = right[j];
//            }
//        }
//    }
//}
