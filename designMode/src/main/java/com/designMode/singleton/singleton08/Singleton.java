package com.designMode.singleton.singleton08;

/**
 * 单例模式8
 * 枚举
 * <p>
 * 步骤:
 * 1.定义枚举类型
 * 2.添加属性
 * <p>
 * 优点:
 * 1.线程安全
 * 2.可以防止反序列化重新创建新的对象
 * <p>
 * 结论:
 * 1.推荐使用
 */
public enum Singleton {

    INSTANCE;
}
