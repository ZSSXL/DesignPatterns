package com.zss.cp.singleton;

import com.zss.cp.factory.product.BombedMazeFactory;
import com.zss.cp.factory.product.EnchantedMazeFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZSS
 * @date 2021/5/28 16:44
 * @desc 迷宫工厂 - 单例
 */
public class MazeFactory {

    private static MazeFactory INSTANCE;

    /**
     * 存储单例对象
     */
    private static Map<String, Object> registry = new HashMap<>();

    private MazeFactory() {
    }

    /**
     * 获取单例
     *
     * @return MazeFactory
     */
    public static MazeFactory instance() {
        if (INSTANCE == null) {
            String mazeStyle = getEnv("MAZE_STYLE");
            if("bombed".equals(mazeStyle)){
                // INSTANCE = new BombedMazeFactory();
                // 实例化 bombedMazeFactory
            } else if("enchanted".equals(mazeStyle)){
                // INSTANCE = new EnchantedMazeFactory();
                // 实例化 EnchantedMazeFactory
            } else if ("others".equals(mazeStyle)){
                // ... 实例化其他类型的子类
            } else {
                INSTANCE = new MazeFactory();
            }
        }
        return INSTANCE;
    }

    /**
     * 获取环境变量
     *
     * @param singletonName 环境变量
     * @return 单例名称
     */
    private static String getEnv(String singletonName) {
        return System.getenv(singletonName);
    }

    protected static Singleton lookUp(String singletonName) {
        return (Singleton) registry.get(singletonName);
    }
}
