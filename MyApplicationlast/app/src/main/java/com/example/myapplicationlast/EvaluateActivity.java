package com.example.myapplicationlast;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EvaluateActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_marquee1; // 声明一个文本视图对象
    private TextView tv_marquee2; // 声明一个文本视图对象
    private TextView tv_marquee3; // 声明一个文本视图对象
    private TextView tv_marquee4; // 声明一个文本视图对象
    private TextView tv_marquee5; // 声明一个文本视图对象
    private TextView tv_marquee6; // 声明一个文本视图对象

    private boolean isPaused = false; // 跑马灯文字是否暂停滚动

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluate);

        // 从布局文件中获取名叫tv_marquee的文本视图
        tv_marquee1 = findViewById(R.id.tv_marquee1);
        tv_marquee2 = findViewById(R.id.tv_marquee2);
        tv_marquee3 = findViewById(R.id.tv_marquee3);
        tv_marquee4 = findViewById(R.id.tv_marquee4);
        tv_marquee5 = findViewById(R.id.tv_marquee5);
        tv_marquee6 = findViewById(R.id.tv_marquee6);

        // 给tv_marquee设置点击监听器
        tv_marquee1.setOnClickListener(this);
        tv_marquee1.requestFocus(); // 强制获得焦点，让跑马灯滚起来
        tv_marquee2.setOnClickListener(this);
        tv_marquee2.requestFocus(); // 强制获得焦点，让跑马灯滚起来
        tv_marquee3.setOnClickListener(this);
        tv_marquee3.requestFocus(); // 强制获得焦点，让跑马灯滚起来
        tv_marquee4.setOnClickListener(this);
        tv_marquee4.requestFocus(); // 强制获得焦点，让跑马灯滚起来
        tv_marquee5.setOnClickListener(this);
        tv_marquee5.requestFocus(); // 强制获得焦点，让跑马灯滚起来
        tv_marquee6.setOnClickListener(this);
        tv_marquee6.requestFocus(); // 强制获得焦点，让跑马灯滚起来
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_marquee1) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee1.setFocusable(false); // 不允许获得焦点
                tv_marquee1.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee1.setFocusable(true); // 允许获得焦点
                tv_marquee1.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee1.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }

        if (v.getId() == R.id.tv_marquee2) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee2.setFocusable(false); // 不允许获得焦点
                tv_marquee2.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee2.setFocusable(true); // 允许获得焦点
                tv_marquee2.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee2.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }
        if (v.getId() == R.id.tv_marquee3) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee3.setFocusable(false); // 不允许获得焦点
                tv_marquee3.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee3.setFocusable(true); // 允许获得焦点
                tv_marquee3.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee3.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }
        if (v.getId() == R.id.tv_marquee4) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee4.setFocusable(false); // 不允许获得焦点
                tv_marquee4.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee4.setFocusable(true); // 允许获得焦点
                tv_marquee4.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee4.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }
        if (v.getId() == R.id.tv_marquee5) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee5.setFocusable(false); // 不允许获得焦点
                tv_marquee5.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee5.setFocusable(true); // 允许获得焦点
                tv_marquee5.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee5.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }
        if (v.getId() == R.id.tv_marquee6) { // 点击了文本视图tv_marquee
            isPaused = !isPaused;
            if (isPaused) {
                tv_marquee6.setFocusable(false); // 不允许获得焦点
                tv_marquee6.setFocusableInTouchMode(false); // 不允许在触摸时获得焦点
            } else {
                tv_marquee6.setFocusable(true); // 允许获得焦点
                tv_marquee6.setFocusableInTouchMode(true); // 允许在触摸时获得焦点
                tv_marquee6.requestFocus(); // 强制获得焦点，让跑马灯滚起来
            }
        }
    }

}