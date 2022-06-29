package com.zss.cp.singleton;

/**
 * @author ZSS
 * @date 2021/5/28 15:47
 * @desc 单例实现
 */
public class SingletonDemo {

    private static SingletonDemo instance;

    private String name;

    /**
     * 私有构造方法，不允许其他类调用以创建实例
     */
    private SingletonDemo() {
    }

    /**
     * 只能通过该方法获取实例
     *
     * @return Singleton
     */
    public static SingletonDemo instance() {
        if (instance == null) {
            instance = new SingletonDemo();
            instance.name = "ZSS";
        }
        return instance;
    }
}
