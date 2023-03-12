package hot100;

import java.util.*;

/*
思路：双指针

 */
public class Hot15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] <= 0) {
                if (i == 0 || nums[i] != nums[i - 1]) {
                    for (int j = len - 1; j >= i + 2; j--) {
                        if (j == len - 1 || nums[j] != nums[j + 1]) {
                            int k = -(nums[i] + nums[j]);
                            if (k < nums[i] || k > nums[j])
                                continue;
                            int flag = Arrays.binarySearch(nums, i + 1, j, k);
                            if (flag > i && flag < j) {
                                lists.add(new ArrayList<>(Arrays.asList(nums[i], k, nums[j])));
                            }
                        }
                    }
                }
            }
        }

        return lists;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;

        for (int k = 0; k < len - 2; k++) {
            if (nums[k] > 0)
                break;
            if (k != 0 && nums[k] == nums[k - 1])
                continue;
            int i = k + 1;
            int j = len - 1;
            while (i < j) {
                if (nums[j] < 0)
                    break;
                if (i != k + 1 && nums[i] == nums[i - 1]) {
                    i++;
                    continue;
                }

                if (j != len - 1 && nums[j] == nums[j + 1]) {
                    j--;
                    continue;
                }

                int sum = nums[k] + nums[i] + nums[j];
                if (sum == 0) {
                    lists.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    i++;
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return lists;
    }
}
