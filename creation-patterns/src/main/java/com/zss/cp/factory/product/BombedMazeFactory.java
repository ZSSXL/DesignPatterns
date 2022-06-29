package com.zss.cp.factory.product;

import com.zss.cp.base.Room;
import com.zss.cp.base.Wall;
import com.zss.cp.base.sub.BombedWall;
import com.zss.cp.base.sub.RoomWithABomb;
import com.zss.cp.factory.BaseMazeFactory;

/**
 * @author ZSS
 * @date 2021/4/19 16:35
 * @desc 具体实现 -- 有炸弹的
 */
public class BombedMazeFactory extends BaseMazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(Integer roomNo) {
        return new RoomWithABomb(roomNo);
    }
}
