package com.zwh.BinarySearch.two;

import java.util.Arrays;

/**
 * 均成立。如果我们将三条边进行升序排序，使它们满足 a \leq b \leq ca≤b≤c，那么 a + c > ba+c>b 和 b + c > ab+c>a 使一定成立的，我们只需要保证 a + b > ca+b>c。
 *
 * 因此，我们可以将数组 \textit{nums}nums 进行升序排序，随后使用二重循环枚举 aa 和 bb。设 a = nums}[i], b = nums[j]a=nums[i],b=nums[j]，为了防止重复统计答案，我们需要保证 i < j,i<j。剩余的边 c,
 * c 需要满足 c < nums[i] + nums}[j],c<nums[i]+nums[j]，我们可以在 [j + 1, n - 1][j+1,n−1] 的下标范围内使用二分查找（其中 nn 是数组 \textit{nums}nums 的长度），找出最大的满足 \textit{nums}[k] < \textit{nums}[i] + \textit{nums}[j]nums[k]<nums[i]+nums[j] 的下标 kk，这样一来，在 [j + 1, k][j+1,k] 范围内的下标都可以作为边 cc 的下标，我们将该范围的长度 k - jk−j 累加入答案。
 *
 * 当枚举完成后，我们返回累加的答案即可。
 *
 * @Date 2022-06-20
 * @Desc 611. 有效三角形的个数
 */
public class TriangleNumber {

    class Solution {
        public int triangleNumber(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int ans = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = i + 1; j < n; ++j) {
                    int left = j + 1, right = n - 1, k = j;
                    while (left <= right) {
                        int mid = (left + right) / 2;
                        if (nums[mid] < nums[i] + nums[j]) {
                            k = mid;
                            left = mid + 1;
                        } else {
                            right = mid - 1;
                        }
                    }
                    ans += k - j;
                }
            }
            return ans;
        }
    }


}
