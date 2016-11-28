package com.example.wangkuan.diguijiasuanfa.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/**
 * autour: 王广宽
 * date: 2016/11/28 10:20
 * update: 2016/11/28
 * explain:递归查询
 */
public class DiGui {

    public static ArrayList<File> getMusic(File file, final String suffi) {
        ArrayList<File> ls = new ArrayList<File>();
        //通过一个过滤器来过滤文件还是绝对路径
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {//是文件
                    return true;//存到数组中
                } else if (file.getAbsolutePath().endsWith(suffi)) {
                    return true;
                }
                return false;
            }
        });
        if (files != null) {
            //遍历数组
            for (File file1 : files) {//如果是文件夹
                if (file1.isDirectory()) {
                    getMusic(file1, suffi);
                } else {
                    ls.add(file1);
                }
            }
        }
        return ls;
    }

}
