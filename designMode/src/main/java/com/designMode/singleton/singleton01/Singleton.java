package com.designMode.singleton.singleton01;

/**
 * 单例模式1
 * 饿汉式(静态常量)
 * <p>
 * 步骤:
 * 1.本类内部创建对象实例
 * 2.构造私有化,外部不能创建
 * 3.提供一个公有静态方法,获取实例对象
 * <p>
 * 优点:
 * 1.写法简单
 * 2.在类装载的时候就完成实例化
 * 3.避免了线程同步问题
 * <p>
 * 缺点:
 * 1.在类装载的时候就完成实例化,没有达到懒加载效果
 * 2.如果从始至终都没有使用过,造成内存的浪费
 * <p>
 * 结论:
 * 1.这种单例模式可用,可能造成内存浪费
 */
public class Singleton {

    // 1.本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    // 2.构造私有化,外部不能创建
    private Singleton() {

    }

    // 3.提供一个公有静态方法,获取实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
