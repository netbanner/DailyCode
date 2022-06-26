package com.zwh.Array;

import com.zwh.TwoPointers.MinWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zwh
 * @date 2022年06月23日 10:18 PM
 */
public class Permute {


        int[] visited;
        Set<String> list = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        public String[] permutation(String s) {
            int len = s.length();
            visited = new int[len];
            //每一个字符都作为起点
            for (int i = 0; i < len; i++) {
                dfs(s, i);
                visited[i] = 0;
                sb.delete(0, sb.length());
            }
            //得到set中的元素
            String[] res = new String[list.size()];
            int count = 0;
            for (String str : list) {
                res[count++] = str;
            }
            return res;
        }
        //递归组合字符
        private void dfs(String s, int i) {
            sb.append(s.charAt(i));
            visited[i] = 1;
            //递归出口，拼接完毕
            if (sb.length() == s.length()) {
                list.add(sb.toString());
                return;
            }
            //循环递归
            for (int j = 0; j < s.length(); j++) {
                if (visited[j] == 0) {
                    dfs(s, j);
                    visited[j] = 0;
                    sb.delete(sb.length() - 1, sb.length());
                }
            }
            return;
        }

    }


