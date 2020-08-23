package com.designMode.singleton.singleton07;

/**
 * 单例模式7
 * 静态内部类
 * <p>
 * 步骤:
 * 1.构造私有化,外部不能创建
 * 2.静态内部类,类中有一个静态属性
 * 3.提供一个公有静态方法,获取实例对象
 * <p>
 * 优点:
 *
 * <p>
 * 结论:
 * 1.
 */
public class Singleton {

    // 1.构造私有化,外部不能创建
    private Singleton() {
    }

    // 2.静态内部类,类中有一个静态属性
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 3.提供一个公有静态方法,获取实例对象
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
