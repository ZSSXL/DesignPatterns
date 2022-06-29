package com.zss.cp.builder;

import com.zss.cp.common.Maze;

/**
 * @author ZSS
 * @date 2021/4/20 10:34
 * @desc 生成器模式
 */
public class MazeBuilder {

    protected MazeBuilder() {
    }

    /**
     * 创建迷宫
     */
    public void buildMaze() {
    }

    /**
     * 创建一个有特定房间号的房间
     *
     * @param roomNo 房间号
     */
    public void buildRoom(Integer roomNo) {
    }

    /**
     * 创建在有号码的房间之间的门
     *
     * @param roomFrom 房间
     * @param roomTo   房间
     */
    public void buildDoor(Integer roomFrom, Integer roomTo) {
    }

    /**
     * 返回迷宫
     *
     * @return Maze
     */
    public Maze getMaze() {
        return new Maze();
    }
}
