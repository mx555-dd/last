package com.example.myapplicationlast.bean;


import com.example.myapplicationlast.R;

import java.util.ArrayList;

public class GoodsInfo {

    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone 12 ", "联想拯救者手机", "荣耀30 Pro", "雅迪电动车", "三星 Galaxy S20", "艾戈勒瑞士手表 ","松下微单相机","OnePlus 8 Pro "
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            " Apple iPhone 12 mini (A2400) 64GB 黑色 手机 支持移动联通电信5G",
            "联想拯救者手机 12GB+128GB 骁龙865",
            "荣耀30 Pro 50倍远摄 麒麟990 5G 4000万超感光摄影",
            "雅迪（yadea）电动车米迪豪华都市版",
            "三星 Galaxy S20 FE 5G(SM-G7810)双模5G 骁龙865",
            "艾戈勒(agelocer)瑞士手表 布达佩斯系列男士全自动机械腕表",
            "松下（Panasonic）GX9微单相机(GX85升级款）数码相机 复古旁轴相机 街拍 、防抖、4K 银色 3598",
            "一加 OnePlus 8 Pro 5G旗舰 2K+120Hz 柔性屏 30W无线闪充"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = { 5499, 3899, 3999,2649, 4999, 2699,3598,5999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone12_s, R.drawable.lainxiang_s, R.drawable.rongyao_s,R.drawable.yadi_s,
            R.drawable.sanxing_s, R.drawable.shoubiao_s, R.drawable.xiangji_s,R.drawable.yijia_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone12, R.drawable.lainxiang, R.drawable.rongyao,R.drawable.yadi,
            R.drawable.sanxing, R.drawable.shoubiao, R.drawable.xiangji,R.drawable.yijia

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

