package com.example.wangkuan.diguijiasuanfa.util;

/**
 * autour: 王广宽
 * date: 2016/11/28 11:23
 * update: 2016/11/28
 * explain:计算住房公积金，个人所需要的钱
 */
public class GongJiJin {
    public static Float getResult(int salary) {

        Float i = salary * 0.12f * 2;
        return i;

    }
}
