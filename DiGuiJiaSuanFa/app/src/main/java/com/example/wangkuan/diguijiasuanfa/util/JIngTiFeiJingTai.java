package com.example.wangkuan.diguijiasuanfa.util;

import android.util.Log;

/**
 * autour: 王广宽
 * date: 2016/11/28 13:55
 * update: 2016/11/28
 * explain:静态非静态的区别
 */
public class JIngTiFeiJingTai {
    int i = 10;//成员变量
    public static int p = 10;//静态成员变量

    //非静态的方法,这个方法只可以调用非静态的成员变量，也可以调用静态成员
    public void getNoVariant() {
        Log.i("feijingtai......调用非静态", i + "");
        Log.i("feijingtai......调用静态", p + "");
    }


    //静态的方法不可以直接调用非静态的方法，只能调用静态的成员变量
    public static void getVariant() {
        //  Log.i("bbbbbbbbbbbbb", i + "");//会报红
        Log.i("jingtai.........调用静态", p + "");
    }

    //静态的方法,如果想调非静态的需要传一个包裹成员变量的对象
    public static void getYesVariant(JIngTiFeiJingTai jt) {

        Log.i("jingtai......调用非静态", jt.i + "");
        Log.i("jingtai......调用静态", p + "");
    }

}
