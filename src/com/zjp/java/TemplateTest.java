package com.zjp.java;

import com.zjp.bean.Customer;

import java.util.ArrayList;

/**
 * 常用的模板
 *
 */
public class TemplateTest {
    //模板六：prsf(已经修改为了main)
    private static final Customer CUST=new Customer();
    //变形：psf(公用)
    public static final int NUM=10;
    //变形psfi,psfs
    public static final int NUM2=8;
    public static final String NAME="zhansan";
    //模板1：psvm -main(首字母组成)
    public static void main(String[] args) {
        //模板二：sout-输出(Syso)
        System.out.println("hello");
        //变形：soutp/soutm/soutv/xxx.sout--参数，方法，变量
        System.out.println("args = [" + args + "]");
        int num=10;
        System.out.println("num = " + num);
        int num2=9;
        System.out.println(num2);
        //模板三
        String[] names={"zhaoyang","lilei","hanmeimei"};
//        for (int i = 0; i <names.length ; i++) {
//            System.out.println(names[i]);
//        }
        //变形：iter--增强for循环
        for (String name : names) {
            System.out.print(name+",");
        }
        //变形：itar
//        for (int i = 0; i < names.length; i++) {
//            String name = names[i];
//            System.out.println(name);
//        }

        //模板四：list.for(list:集合名称)
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(0, "aaa");
        arrayList.add(1, "bbb");
        arrayList.add(2, "ccc");

//        for (String s : arrayList) {
//            System.out.println(s);
//        }
        //变形：list.fori:索引正序遍历
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //forr:反向遍历
//        for (int i = arrayList.size() - 1; i >= 0; i--) {
//            System.out.println(arrayList.get(i));
//        }



    }
    public  void method(){
        System.out.println("TemplateTest.method");

        //模板五：ifn--判断是否为null（if null）
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add(0, "aaa");
        arrayList.add(1, "bbb");
        arrayList.add(2, "ccc");
        if (arrayList == null) {

        }
        //变形inn(if not null)
        if (arrayList != null) {
            
        }
        //变形：xxx.nn/xxx.null(not null ,null)
        if (arrayList == null) {

        }
         if (arrayList != null) {

        }

    }

}
