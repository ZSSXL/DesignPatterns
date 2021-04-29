package com.zss.cp.builder.sub;

import com.zss.cp.builder.MazeBuilder;
import com.zss.cp.common.Maze;

/**
 * @author ZSS
 * @date 2021/4/20 11:11
 * @desc 不创建迷宫，仅仅对已被创建的不同种类的构件进行计数
 */
public class CountingMazeBuilder extends MazeBuilder {

    private Integer doors;
    private Integer rooms;

    public CountingMazeBuilder() {
        rooms = doors = 0;
    }

    @Override
    public void buildMaze() {
        super.buildMaze();
    }

    @Override
    public void buildRoom(Integer roomNo) {
        rooms ++;
    }

    @Override
    public void buildDoor(Integer roomFrom, Integer roomTo) {
        doors ++;
    }

    /**
     * 计数
     * @param rooms 房间
     * @param doors 门
     */
    public void getCounts(Integer rooms, Integer doors){
        this.rooms = rooms;
        this.doors = doors;
    }
}
