package com.zss.cp.builder.sub;

import com.zss.cp.base.Door;
import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;
import com.zss.cp.builder.MazeBuilder;
import com.zss.cp.common.Maze;
import com.zss.cp.constant.Direction;

/**
 * @author ZSS
 * @date 2021/4/20 10:49
 * @desc 创建简单迷宫的实现
 */
public class StandardMazeBuilder extends MazeBuilder {

    private Maze currentMaze;

    public StandardMazeBuilder() {
        currentMaze = new Maze();
    }

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(Integer roomNo) {
        if (currentMaze.roomNo(roomNo) == null) {
            Room room = new Room(roomNo);
            room.setSites(Direction.North, new Wall());
            room.setSites(Direction.South, new Wall());
            room.setSites(Direction.East, new Wall());
            room.setSites(Direction.West, new Wall());
            currentMaze.addRoom(room);
        }
    }

    /**
     * 建造一扇两个房间之间的门，StandardMazeBuilder查找迷宫中的这两个房间找到他们响铃的门
     *
     * @param roomFrom 房间
     * @param roomTo   房间
     */
    @Override
    public void buildDoor(Integer roomFrom, Integer roomTo) {
        Room r1 = currentMaze.roomNo(roomFrom);
        Room r2 = currentMaze.roomNo(roomFrom);
        Door door = new Door(r1, r2);

        r1.setSites(commonWall(r1, r2), door);
        r2.setSites(commonWall(r1, r2), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    /**
     * 功能性操作 -- 决定两个房间之间的公共墙壁的方位
     *
     * @param r1 房间-1
     * @param r2 房间-2
     * @return 方位
     */
    private Direction commonWall(Room r1, Room r2) {
        return null;
    }
}
