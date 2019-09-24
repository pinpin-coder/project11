package com.zjp.bean;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


/**
 * 生成返回值或者纠错：alter+enter
 * 查看源码：ctrl+shift+t或者按住alt
 * 向下移动行：alt+向下
 * 向上移动行：alt+向上
 * 开始新的一行：shift+enter(向下)
 * 退回到前一个编辑的页面：alter+left(back)
 * 进入到下一个编辑的页面：alter+right(forward)
 * 查看继承关系：F4
 *
 * 格式化：ctrl+shift+f
 * 提示方法参数类型：ctrl+shift+/
 * 查看类的结构：ctrl+o
 * 重构：修改变量名和方法名（批量一次性修改相同的名称）
 * 大小写转换：ctrl+shift+y
 * 生成构造器/get/set/tostring方法：alt+insert
 * 快速生成try...catch:alt+shift+z
 * 输出输出语句：sout
 *局部变量抽取为成员变量：alt+shift+f
 * ctrl+H:全局查找
 * 查看类的继承结构图：ctrl+alt+shift+u
 *查看方法的多层重写结构：ctrl+alt+h
 * 添加到收藏夹：ctrl+alt+f
 * 抽取方法：alt+shift+m
 *打开最近修改的文件：ctrl+e
 * ctrl+shift+q:快速搜索类中的错误
 * 查找方法在哪里调用过：ctrl+shift+h
 * 选择要粘贴的内容：ctrl+shift+v
 * 抛出异常：定位到该行，alt+enter
 */
public class Customer {

    private  static final int INITIAL_SIZE=10;//常量
    public static void main(String[] args){
        System.out.println("hello world!!!");
    }

    public void test(){
        //region Description
        System.out.println("test");
        Date date = new Date();
        //endregion
        ArrayList<String> arrayList=new ArrayList<String>();
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
            FileWriter fileWriter=new FileWriter("1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    }

