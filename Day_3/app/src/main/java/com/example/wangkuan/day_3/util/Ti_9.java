package com.example.wangkuan.day_3.util;

/**
 * autour: 王广宽       
 * date: 2016/11/30 20:00   
 * update: 2016/11/30   
 * explain:有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
 */
public class Ti_9 {
    public static boolean[] doCall(int person) {
        boolean[] persons = new boolean[person];
        int number = person, key = 0;
        for (int i = 0; i < person; i++)
            persons[i] = true;
        while (number != 1) {
            for (int i = 0; i < person; i++) {
                if (!persons[i]) {
                    continue;
                } else {
                    key++;
                    if (key % 3 == 0) {
                        System.out.println("编号为："+(i+1)+"的人退出。");
                        persons[i] = false;
                        key = 0;
                    }
                }
            }
            number = 0;
            for (int i = 0; i < person; i++) {
                if (persons[i]) {
                    number++;
                }
            }
        }
        return persons;
    }
}
