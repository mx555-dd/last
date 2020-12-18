package com.example.myapplicationlast.bean;

import com.example.myapplicationlast.R;

import java.util.ArrayList;

public class GoInfo {
    public int pic_id;
    public String title;
    public String desc;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"天猫新品", "今日爆款", "天猫国际", "天猫超市",
            "饿了么", "充值中心", "机票酒店", "金币庄园", "闲鱼", "会员中心"};

    public static ArrayList<GoInfo> getDefaultGrid() {
        ArrayList<GoInfo> gridArray = new ArrayList<GoInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }



    private static int[] stagImageArray = {R.drawable.w_1, R.drawable.w_2, R.drawable.w_3
            , R.drawable.w_4, R.drawable.w_6, R.drawable.w_5};
    private static String[] stagTitleArray = {"品牌折扣", "划算好货", "淘抢购", "天天特卖", "9.9包邮", "每日精品"};

    public static ArrayList<GoInfo> getDefaultStag() {
        ArrayList<GoInfo> stagArray = new ArrayList<GoInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }





}
