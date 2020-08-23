package com.designMode.singleton.singleton05;

/**
 * 单例模式5
 * 懒汉式(线程安全,同步代码块)
 * <p>
 * 步骤:
 * 1.本类内部声明对象实例
 * 2.构造私有化,外部不能创建
 * 3.提供一个公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
 * 4.在创建对象实例时,添加同步代码块
 * <p>
 * 缺点:
 * 1.解决不了线程安全问题
 * <p>
 * 结论:
 * 1.在实际开发中,不能使用这种方式
 */
public class Singleton {

    // 1.本类内部声明对象实例
    private static Singleton instance;

    // 2.构造私有化,外部不能创建
    private Singleton() {

    }

    // 3.提供一个公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
    public static Singleton getInstance() {
        if (instance == null) {
            // 4.在创建对象实例时,添加同步代码块
            synchronized (Singleton.class) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
