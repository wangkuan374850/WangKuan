package com.example.wangkuan.day_3;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wangkuan.day_3.util.Ti_1;
import com.example.wangkuan.day_3.util.Ti_9;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b9;
    private Button b10;
    private File externalStorageDirectory;
    private File f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.a1);
        b2 = (Button) findViewById(R.id.a2);
        b4 = (Button) findViewById(R.id.a4);
        b5 = (Button) findViewById(R.id.a5);
        b6 = (Button) findViewById(R.id.a6);
        b9 = (Button) findViewById(R.id.a9);
        b10 = (Button) findViewById(R.id.a10);
        externalStorageDirectory = Environment.getExternalStorageDirectory();
        // f = new File("E:\\");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Ti_1.fileList(externalStorageDirectory);
            }
        });
        //输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss = "AFAFAFAFazazazazaz12122151616+=.....";
                int x = 0;
                int eng = 0, spa = 0, num = 0, other = 0;
                while (x < ss.length()) {
                    if (ss.charAt(x) <= 'z' && ss.charAt(x) >= 'a')
                        eng++;
                    else if (ss.charAt(x) == ' ')//要用else if
                        spa++;
                    else if (ss.charAt(x) <= '9' && ss.charAt(x) >= '0')
                        num++;
                    else
                        other++;
                    x++;
                }
                Log.i("英文字母个数", eng + "");
                Log.i("空格数", spa + "");
                Log.i("数字数", num + "");
                Log.i("其他字符", other + "");
            }
        });
//有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = 0;
                for (int x = 1; x < 5; x++) {
                    for (int y = 1; y < 5; y++) {
                        for (int z = 1; z < 5; z++) {
                            if (x != y && y != z && x != z) {
                                count++;
                                Log.i("组成的值", x * 100 + y * 10 + z + "");//System.out.println(x * 100 + y * 10 + z);
                            }
                        }
                    }
                }
                Log.i("共有", "" + count + "个三位数");
            }
        });
        //求1+2!+3!+...+20!的和
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = 0;
                // int fac = 1;
                int b = 2;
                for (int i = 1; i <= 20; i++) {
                    b = b + i;
                }
                Log.i("共和是", "" + b);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      int i, j;
                                      int a[][];
                                      a = new int[8][8];
                                      for (i = 0; i < 8; i++) {
                                          a[i][i] = 1;
                                          a[i][0] = 1;
                                      }
                                      for (i = 2; i < 8; i++) {
                                          for (j = 1; j <= i - 1; j++) {
                                              a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                                          }
                                      }
                                      for (i = 0; i < 8; i++) {
                                          for (j = 0; j < i; j++) {
                                              System.out.printf("  " + a[i][j]);
                                              ///  Log.i("  ", " " + a[i][j]);
                                          }
                                          System.out.println();
                                      }
                                  }

                              }

        );
        //有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean[] booleen = Ti_9.doCall(30);
                for (int i = 0; i < booleen.length; i++) {
                    if (booleen[i]) {
                        System.out.println("最后留下的是：" + (i + 1) + "号。");
                    }
                }
            }
        });
        //求100之内的素数
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i, n, k = 0;
                for (n = 3; n <= 100; n++) {     //3~100的所有数
                    i = 2;
                    while (i < n) {
                        if (n % i == 0) break;  //若能整除说明n不是素数，跳出当前循环
                        i++;
                    }


                    if (i == n) {     //如果i==n则说明n不能被2~n-1整除，是素数
                        k++;             //统计输出数的个数
                        System.out.print(i + "\t ");
                        if (k % 6 == 0)    //每输出5个则换行
                            System.out.println();
                    }
                }
            }
        });
    }
}
