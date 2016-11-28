package com.example.wangkuan.diguijiasuanfa.util;

import android.util.Log;

/**
 * autour: 王广宽
 * date: 2016/11/28 11:42
 * update: 2016/11/28
 * explain:二分查找法
 */
public class ErFenChaZhao {
    public static int search(int[] arr, int key) {
        int start = 0;//起始点
        int end = arr.length - 1;//终点
        while (start <= end) {//循环条件，这样写循环的次数是数组的长度
            int middle = (start + end) / 2;
            Log.i("aaaaaaaaaaaaaaa", middle + "");
            if (key < arr[middle]) {
                end = middle - 1;
            } else if (key > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
