package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * 适配器模式
 * 目的：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容 而不能一起工作的那些类可以一起工作。
 */
public class Adaptee {

    public void adapteeMethod(){
        System.out.println("invoke adapteeMethod");
    }
}
