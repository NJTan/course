package com.example.mycourse;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;


import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.mycourse.R;

public class MainActivity extends FragmentActivity  {
    private String tilte[]={"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
    private String settingText[][]={{
     "星期一","\n\n\n--------------\n数据仓库与数据挖掘--李忠金\n第3-5节\n 第3教研楼311\n\n\n--------------\nAndroid移动开发--赵丽娜\n第6-7节\n第1教研楼233\n"
    },{
            "星期二","\n\n\n--------------\n计算机网络（甲）--徐建\n第1-2节\n 第6教研楼312\n\n\n--------------\n数据库原理--张红娟\n第3-5节\n 第12教研楼202\n\n\n --------------\n软件工程--穆海伦\n第6-8节\n第7教研楼320\n"
    },
            {

                    "星期三","\n\n\n--------------\nACM程序设计竞赛实训（甲）--刘春英\n第10-12节\n 第3教研楼411\n"
            },
            {
                    "星期四","\n\n\n--------------\n算法分析与设计--张旻\n第1-2节\n 第7教研楼218\n\n\n--------------\n操作系统（甲）--赵伟华\n第3-5节\n 第6教研楼310\n\n\n --------------\n计算机网络（甲）--徐建\n第6-7节\n第6教研楼北222\n\n\n--------------\n可视计算基础\n第10-12节\n第12教研楼北112\n"
            },{
             "星期五","\n\n\n--------------\n算法分析与设计（双周）--张旻\n第1-2节\n 第7教研楼北218\n\n\n--------------\n物联网工程导论--叶挺聪\n第6-7节\n 第6教研楼北218\n"
    },{
        "星期六","\n\n\n--------------\n居然没有课耶\n\n"
    },
            {
                    "星期日","\n\n\n--------------\n居然没有课耶\n\n"
            }
    };

    public String[] getTilte() {
        return tilte;
    }

    public String[][] getSettingText() {
        return settingText;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        course_database course =new course_database(MainActivity.this);
//        SQLiteDatabase dp=course.getReadableDatabase();
        setTitleFragment titleFragment=new setTitleFragment();
        setContentFragment contentFragment=new setContentFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.setday,titleFragment);
        transaction.replace(R.id.setcourse,contentFragment);
        transaction.commit();
    }

}