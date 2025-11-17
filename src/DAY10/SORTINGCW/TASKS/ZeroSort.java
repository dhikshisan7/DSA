package DAY10.SORTINGCW.TASKS;

import java.util.Arrays;

public class ZeroSort {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 0, 4, 0};
        int n =nums.length;
        System.out.println("OG Array:"+Arrays.toString(nums));
        for(int i=0;i<n-1;i++){
            for (int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] == 0 && nums[j + 1] != 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array(0s to right):");
        System.out.println(Arrays.toString(nums));

    }
}

