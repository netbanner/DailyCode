package com.zwh.June;

/**
 * @author zwh
 * @date 2022年06月25日 9:31 AM
 * @desc 1870. 准时到达的列车最小时速
 * 二分查找
 */
public class MinSpeedOnTime {

    public static void main(String[] args) {
        MinSpeedOnTime mst = new MinSpeedOnTime();
        System.out.println(mst.minSpeedOnTime(new int[]{1, 3, 2}, 2.7));
    }


    public int minSpeedOnTime(int[] dist, double hour) {
        int l = 1, r = 10000000;
        int ans = -1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            double cur = 0;
            for (int i = 0; i < dist.length - 1; i++) {
                cur += (dist[i] + mid - 1) / mid;
            }
            cur += 1d * dist[dist.length - 1] / mid;
            if (cur <= hour) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }


}
