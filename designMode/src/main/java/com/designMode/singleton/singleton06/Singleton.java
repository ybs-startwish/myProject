package com.designMode.singleton.singleton06;

/**
 * 单例模式6
 * 双重检查
 * <p>
 * 步骤:
 * 1.本类中声明对象实例
 * 2.构造私有化,外部不能创建
 * 3.提供一个公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
 * 4.添加同步代码块,加入双重检查
 * <p>
 * 优点:
 * 1.线程安全
 * 2.效率高
 * 3.懒加载效果
 * <p>
 * 结论:
 * 1.在实际开发中,推荐使用这种单例设计模式
 */
public class Singleton {

    // 1.本类中声明对象实例
    private static volatile Singleton instance;

    // 2.构造私有化,外部不能创建
    private Singleton() {

    }

    // 3.提供一个公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
    public static Singleton getInstance() {
        if (instance == null) {
            // 4.添加同步代码块,加入双重检查
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
