package com.zss.cp.factory.prototype;

import com.zss.cp.base.Door;
import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;
import com.zss.cp.common.Maze;
import com.zss.cp.factory.BaseMazeFactory;

/**
 * @author zhoushs@dist.com.cn
 * @date 2021/5/25 17:24
 * @desc 原型 - 代码实现
 */
public class MazePrototypeFactory extends BaseMazeFactory {

    private Maze prototypeMaze;

    private Room prototypeRoom;

    private Wall prototypeWall;

    private Door prototypeDoor;

    public MazePrototypeFactory(Maze prototypeMaze, Room prototypeRoom, Wall prototypeWall, Door prototypeDoor) {
        this.prototypeMaze = prototypeMaze;
        this.prototypeRoom = prototypeRoom;
        this.prototypeWall = prototypeWall;
        this.prototypeDoor = prototypeDoor;
    }

    @Override
    public Maze makeMaze() {
        return this.prototypeMaze.clone();
    }

    @Override
    public Wall makeWall() {
        return this.prototypeWall.clone();
    }

    @Override
    public Room makeRoom(Integer roomNo) {
        return this.prototypeRoom.clone();
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return this.prototypeDoor.clone();
    }

}
