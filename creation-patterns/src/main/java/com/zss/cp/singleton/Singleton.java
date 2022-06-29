package com.zss.cp.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZSS
 * @date 2021/5/28 15:47
 * @desc 单例实现
 */
public class Singleton {

    private static Singleton INSTANCE;

    /**
     * 存储单例对象
     */
    private static Map<String, Object> registry = new HashMap<>();

    public static void register(String singletonName, Singleton singleton) {
        registry.put(singletonName, singleton);
    }

    public static Singleton instance() {
        if (INSTANCE == null) {
            String singletonName = getEnv("SINGLETON");
            INSTANCE = lookUp(singletonName);
            // 没有这个单例，则返回null
        }
        return INSTANCE;
    }

    /**
     * 获取环境变量
     *
     * @param singleton 环境变量
     * @return 单例名称
     */
    private static String getEnv(String singleton) {
        String envValue = System.getenv(singleton);
        System.out.println("Env: [" + envValue + "]");
        return singleton;
    }

    protected static Singleton lookUp(String singletonName) {
        return (Singleton) registry.get(singletonName);
    }
}
