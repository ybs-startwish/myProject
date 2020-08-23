package com.designMode.singleton.singleton04;

/**
 * 单例模式4
 * 懒汉式(线程安全,同步方法)
 * <p>
 * 步骤:
 * 1.本类内部声明对象实例
 * 2.构造私有化,外部不能创建
 * 3.提供一个同步的,公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
 * <p>
 * 优点:
 * 1.起到懒加载的效果
 * 2.解决了线程安全问题
 * <p>
 * 缺点:
 * 1.效率太低,每个线程要想获取对象实例时,都需要进行同步
 * <p>
 * 结论:
 * 1.在实际开发中,不推荐使用这种方式
 */
public class Singleton {

    // 1.本类内部声明对象实例
    private static Singleton instance;

    // 2.构造私有化,外部不能创建
    private Singleton() {

    }

    // 3.提供一个同步的,公有静态方法,获取实例对象,当使用到该方法时,才去创建对象实例
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
