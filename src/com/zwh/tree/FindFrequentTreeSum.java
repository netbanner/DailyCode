package com.zwh.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 508. 出现次数最多的子树元素和
 * @date 2022-06-19
 */
public class FindFrequentTreeSum {

    Map<Integer,Integer> map = new HashMap<>();
    int max = 0;

    public int [] findFrequentTreeSum(TreeNode root){
        dfs(root);
        System.out.println(map);
        List<Integer> list = new ArrayList<>();
        for(int k:map.keySet()){
            if(map.get(k)==max){
                list.add(k);
            }
        }
        int []ans = new int[list.size()];
        for(int i=0;i< list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }

    int dfs(TreeNode root){
        if(root==null) return 0;

        int cur = root.val +dfs(root.left)+dfs(root.right);
        map.put(cur,map.getOrDefault(cur,0)+1);
        max = Math.max(max,map.get(cur));
        return cur;
    }
}
