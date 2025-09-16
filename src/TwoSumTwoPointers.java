import java.util.Arrays;

public class TwoSumTwoPointers {
    public static int[] TwoSum(int[] arry, int target) {
        Arrays.sort(arry);
        int left = 0;
        int right = arry.length - 1;
        while (left < right) {
            int sum = arry[left] + arry[right];
            if (sum == target) {
                return new int[]{arry[left], arry[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }

        }
        return new int[]{};

    }
}