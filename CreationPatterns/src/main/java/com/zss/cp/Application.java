package com.zss.cp;

import com.zss.cp.builder.MazeBuilder;
import com.zss.cp.builder.sub.CountingMazeBuilder;
import com.zss.cp.builder.sub.StandardMazeBuilder;
import com.zss.cp.common.Maze;
import com.zss.cp.factory.BaseWidgetFactory;
import com.zss.cp.factory.product.BombedMazeFactory;
import com.zss.cp.factory.product.EnchantedMazeFactory;
import com.zss.cp.factory.product.MotifWidgetFactory;
import com.zss.cp.factory.product.PMWidgetFactory;
import com.zss.cp.game.MazeGame;
import com.zss.cp.game.sub.BombedMazeGame;
import com.zss.cp.game.sub.EnchantedMazeGame;

/**
 * @author ZSS
 * @date 2021/4/20 15:54
 * @desc 创建型模式
 */
public class Application {

    public static void main(String[] args) {
        String envValue = System.getenv("JAVA_HOME");
        System.out.println("Env: [" + envValue + "]");
        System.out.println("============= 创建型模式 =============");
    }

    /**
     * AbstractFactory -- 抽象工厂模式的应用
     */
    private void useAbstractFactory() {
        /*
         * eg
         */
        BaseWidgetFactory motif = new MotifWidgetFactory();
        BaseWidgetFactory pm = new PMWidgetFactory();

        motif.createWindow();
        motif.createScrollBar();

        pm.createWindow();
        pm.createScrollBar();

        /*
         * AbstractFactory
         */
        // 建造一个包含炸弹的迷宫
        MazeGame mazeGame = new MazeGame();
        BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();
        Maze mazeV1 = mazeGame.createMazeV2(bombedMazeFactory);
        // 建造一个附魔的迷宫
        EnchantedMazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        Maze mazeV2 = mazeGame.createMazeV2(enchantedMazeFactory);

        System.out.println(mazeV1.toString());
        System.out.println(mazeV2.toString());
    }

    /**
     * Builder -- 生成者模式的应用
     */
    private void useBuilder() {
        /*
         * Builder
         */
        MazeGame game = new MazeGame();
        // 使用StandardMazeBuilder
        MazeBuilder standardMazeBuilder = new StandardMazeBuilder();
        Maze mazeBuilder = game.createMazeV3(standardMazeBuilder);
        // 使用CountingMazeBuilder - 特殊
        Integer rooms = 0, doors = 0;
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        game.createMazeV3(countingMazeBuilder);
        countingMazeBuilder.getCounts(rooms, doors);
        System.out.println("The maze has [Room: " + rooms + "] and [Door: " + doors + "]");
    }

    /**
     * FactoryMethod -- 工厂方法模式的应用
     * -- 怎么感觉还是有点像：抽象方法
     * -- 回头有时间再来看看
     */
    private void userFactoryMethod() {
        MazeGame game = new MazeGame();

        MazeGame bombedMazeFactory = new BombedMazeGame();
        Maze maze1 = game.createMazeV4(bombedMazeFactory);

        EnchantedMazeGame enchantedMazeGame = new EnchantedMazeGame();
        Maze maze2 = game.createMazeV4(enchantedMazeGame);

    }
}
