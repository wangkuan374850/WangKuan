package com.example.wangkuan.diguijiasuanfa;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wangkuan.diguijiasuanfa.util.DiGui;
import com.example.wangkuan.diguijiasuanfa.util.ErFenChaZhao;
import com.example.wangkuan.diguijiasuanfa.util.GongJiJin;
import com.example.wangkuan.diguijiasuanfa.util.JIngTiFeiJingTai;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.a1);
        b2 = (Button) findViewById(R.id.a2);
        b3 = (Button) findViewById(R.id.a3);
        b4 = (Button) findViewById(R.id.a4);

        //递归查询
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //得到内存卡的根路径
                File file = Environment.getExternalStorageDirectory();
                ArrayList<File> music = DiGui.getMusic(file, ".mp3");
                for (File l : music) {
                    Log.i(TAG, l.getAbsolutePath());//把这个绝对路径放到播放器中就可以播放音乐了
                }
            }
        });
        //计算公积金
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float result = GongJiJin.getResult(12000);
                Log.i(TAG, result + "");
            }
        });
        //二分查找
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] arr = new int[]{12, 23, 34, 45, 56, 67, 77, 89};
                int search = ErFenChaZhao.search(arr, 56);
                Log.i(TAG, search + "");
            }
        });
        //静态和非静态调用的区别
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JIngTiFeiJingTai.getVariant();//调用静态调静态变量

                int p = JIngTiFeiJingTai.p;
                Log.i("调用静态变量。。。。。。", p + "");

                //调用非静态的方法new对象
                JIngTiFeiJingTai jt = new JIngTiFeiJingTai();
                jt.getNoVariant();

                //静态方法掉用非静态变量
                JIngTiFeiJingTai.getYesVariant(jt);
            }
        });

    }
}
