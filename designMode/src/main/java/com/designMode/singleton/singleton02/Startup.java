package com.designMode.singleton.singleton02;

/**
 * 启动器
 * 单例模式2
 * 饿汉式(静态代码块)
 */
public class Startup {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("实例1: " + instance1);
        System.out.println("实例2: " + instance2);
    }
}
