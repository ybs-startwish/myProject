package com.designMode.singleton.singleton01;

/**
 * 启动类
 * 单例模式1
 * 饿汉式(静态常量)
 */
public class Startup {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("实例1: " + instance1);
        System.out.println("实例2: " + instance2);
    }
}
