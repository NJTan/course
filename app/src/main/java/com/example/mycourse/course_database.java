package com.example.mycourse;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class course_database extends SQLiteOpenHelper {
    public course_database(Context context){
        super(context, "course_db",null,1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       String sql= "create table course( id integer primary key autoincrement ,weekday varchar(20),coursename varchar(40),teacher varchar(20),daytime varchar(30),classroom varchar(30))";
       String sql2="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期一','数据仓库与数据挖掘','李忠金','第3-5节','第3教研楼311')";
       String sql3="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期一','Android移动开发','赵丽娜','第6-9节','第1教研楼233')";
       String sql4="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期二','计算机网络（甲）','徐建','第1-2节','第6教研楼312')";
       String sql5="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期二','数据库系统原理（甲）','张红娟','第3-5节','第12教研楼202')";
       String Sql6="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期二','软件工程（甲）','穆海伦','第6-8节','第7教研楼320')";
       String sql7= "insert into course(weekday,coursename,teacher,daytime,classroom) values('星期三','ACM竞赛实训（甲）','刘春英','第10-12节','第3教研楼411')";
        String sql8= "insert into course(weekday,coursename,teacher,daytime,classroom) values('星期四','算法分析与设计','张旻','第1-2节','第7教研楼218')";
       String sql9="insert into course(weekday,coursename,teacher,daytime,classroom) values('星期四','操作系统','赵伟华','第3-5节','第6教研楼310')" ;
       String sql10= "insert into course(weekday,coursename,teacher,daytime,classroom) values('星期四','计算机网络（甲）','徐建','第6-7节','第6教研楼222')";
        String sql11= "insert into course(weekday,coursename,teacher,daytime,classroom) values('星期四','可视计算基础','计忠平','第10-12节','第1教研楼112')";
        String sql12 = "insert into course(weekday,coursename,teacher,daytime,classroom) values('星期五','物联网工程导论','叶挺聪','第6-7节','第6教研楼202')";
        db.execSQL(sql2);
        db.execSQL(sql3);
        db.execSQL(sql);
        db.execSQL(Sql6);
        db.execSQL(sql4);
        db.execSQL(sql5);
        db.execSQL(sql7);
        db.execSQL(sql8);
        db.execSQL(sql9);
        db.execSQL(sql10);
        db.execSQL(sql11);
        db.execSQL(sql12);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
