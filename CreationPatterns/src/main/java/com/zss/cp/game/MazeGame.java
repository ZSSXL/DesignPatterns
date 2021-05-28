package com.zss.cp.game;

import com.zss.cp.builder.MazeBuilder;
import com.zss.cp.builder.sub.CountingMazeBuilder;
import com.zss.cp.builder.sub.StandardMazeBuilder;
import com.zss.cp.common.Maze;
import com.zss.cp.constant.Direction;
import com.zss.cp.factory.BaseMazeFactory;
import com.zss.cp.factory.BaseWidgetFactory;
import com.zss.cp.factory.product.BombedMazeFactory;
import com.zss.cp.factory.product.EnchantedMazeFactory;
import com.zss.cp.factory.product.MotifWidgetFactory;
import com.zss.cp.factory.product.PMWidgetFactory;
import com.zss.cp.base.Door;
import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;
import com.zss.cp.factory.prototype.MazePrototypeFactory;

/**
 * @author ZSS
 * @date 2021/4/19 14:07
 * @desc 创建迷宫 -- 使用一系列操作将构建添加到迷宫中
 */
@SuppressWarnings("unused")
public class MazeGame {

    /**
     * version: 1
     *
     * @return maze
     */
    public Maze createMazeV1() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door theDoor = new Door(room1, room2);

        room1.setSites(Direction.North, new Wall());
        room1.setSites(Direction.East, theDoor);
        room1.setSites(Direction.South, new Wall());
        room1.setSites(Direction.West, new Wall());

        room2.setSites(Direction.North, new Wall());
        room2.setSites(Direction.East, theDoor);
        room2.setSites(Direction.South, new Wall());
        room2.setSites(Direction.West, new Wall());

        maze.addRoom(room1);
        maze.addRoom(room2);
        return maze;
    }

    /**
     * version: 2 -- 使用抽象工厂
     *
     * @param mazeFactory 抽象工厂
     * @return maze
     */
    public Maze createMazeV2(BaseMazeFactory mazeFactory) {
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door aDoor = mazeFactory.makeDoor(room1, room2);
        Maze maze = mazeFactory.makeMaze();

        room1.setSites(Direction.North, aDoor);
        room1.setSites(Direction.East, new Wall());
        room1.setSites(Direction.South, new Wall());
        room1.setSites(Direction.West, new Wall());

        room2.setSites(Direction.North, new Wall());
        room2.setSites(Direction.East, new Wall());
        room2.setSites(Direction.South, new Wall());
        room2.setSites(Direction.West, aDoor);
        return maze;
    }

    /**
     * version：3 -- 使用生成者
     *
     * @param mazeBuilder 生成者
     * @return 迷宫
     */
    public Maze createMazeV3(MazeBuilder mazeBuilder) {
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1, 2);
        mazeBuilder.buildMaze();

        return mazeBuilder.getMaze();
    }

    public Maze createComplexMaze(MazeBuilder mazeBuilder) {
        mazeBuilder.buildRoom(1);
        // ...
        mazeBuilder.buildRoom(1001);

        return mazeBuilder.getMaze();
    }

    /**
     * version：4 -- 工厂方法
     *
     * @return maze
     */
    public Maze createMazeV4(MazeGame mazeGame) {
        Room r1 = mazeGame.makeRoom(1);
        Room r2 = mazeGame.makeRoom(2);
        Door door = mazeGame.makeDoor(r1, r2);
        Maze maze = mazeGame.makeMaze();
        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSites(Direction.North, new Wall());
        r1.setSites(Direction.East, door);
        r1.setSites(Direction.South, new Wall());
        r1.setSites(Direction.West, new Wall());

        r2.setSites(Direction.North, new Wall());
        r2.setSites(Direction.East, new Wall());
        r2.setSites(Direction.South, new Wall());
        r2.setSites(Direction.West, door);

        return maze;
    }

    public MazePrototypeFactory bombedMazeFactory() {
        return null;
        // todo 原型有点复杂，以后后面再来看
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(Integer roomNo) {
        return new Room(roomNo);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public void factory() {
        BaseWidgetFactory motif = new MotifWidgetFactory();
        BaseWidgetFactory pm = new PMWidgetFactory();

        motif.createWindow();
        motif.createScrollBar();

        pm.createWindow();
        pm.createScrollBar();
    }

}
