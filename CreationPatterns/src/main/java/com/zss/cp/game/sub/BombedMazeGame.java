package com.zss.cp.game.sub;

import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;
import com.zss.cp.base.sub.BombedWall;
import com.zss.cp.base.sub.RoomWithABomb;
import com.zss.cp.game.MazeGame;

/**
 * @author ZSS
 * @date 2021/4/20 15:32
 * @desc 工厂方法
 */
public class BombedMazeGame extends MazeGame {

    public BombedMazeGame() {
    }

    @Override
    public Room makeRoom(Integer roomNo) {
        // 重定义，返回一个爆炸后的实体
        return new RoomWithABomb(roomNo);
    }

    @Override
    public Wall makeWall() {
        // 重定义，返回一个爆炸后的实体
        return new BombedWall();
    }
}
