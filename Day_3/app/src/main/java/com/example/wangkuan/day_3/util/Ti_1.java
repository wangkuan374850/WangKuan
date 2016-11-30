package com.example.wangkuan.day_3.util;

import android.util.Log;

import java.io.File;

/**
 * autour: 王广宽
 * date: 2016/11/30 13:37
 * update: 2016/11/30
 * explain:遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
 * 要求：尽可能简单、逻辑清晰
 * 所选存储格式结构也能看出层级关系，并可读写后直接使用
 */
public class Ti_1 {


    public static void fileList(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                Log.i("AAAAA",f.getPath());
                fileList(f);
            }
        }

}
}
