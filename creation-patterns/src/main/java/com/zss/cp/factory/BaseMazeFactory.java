package com.zss.cp.factory;

import com.zss.cp.common.Maze;
import com.zss.cp.base.Door;
import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;

/**
 * @author ZSS
 * @date 2021/4/19 15:59
 * @desc 迷宫 -- 不给它抽象：因此既可以作为AbstractFactory，也可以作为ConcreteFactory（具体类）
 * 这是一个完全由工厂方法组成的具体类
 */
public class BaseMazeFactory {

    public BaseMazeFactory() {
        System.out.println("构造方法");
    }

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(Integer roomNo) {
        return new Room(roomNo);
    }

    public Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }

}
