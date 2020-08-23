package com.designMode.singleton.singleton02;

/**
 * 单例模式2
 * 饿汉式(静态代码块)
 * <p>
 * 步骤:
 * 1.本类内部声明对象实例
 * 2.静态代码块中创建实例对象
 * 3.构造器私有化,外部不能创建
 * 4.提供一个公有静态方法,获取实例对象
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

    // 1.本类内部声明对象实例
    private static Singleton instance;

    // 2.静态代码块中创建实例对象
    static {
        instance = new Singleton();
    }

    // 3.构造器私有化,外部不能创建
    private Singleton() {

    }

    // 4.提供一个公有静态方法,获取实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
