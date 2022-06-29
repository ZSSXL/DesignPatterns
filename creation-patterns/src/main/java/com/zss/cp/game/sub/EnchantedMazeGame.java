package com.zss.cp.game.sub;

import com.zss.cp.base.Door;
import com.zss.cp.base.Room;
import com.zss.cp.base.sub.DoorNeedingSpell;
import com.zss.cp.base.sub.EnchantedRoom;
import com.zss.cp.common.Spell;
import com.zss.cp.game.MazeGame;

/**
 * @author ZSS
 * @date 2021/4/20 15:51
 * @desc 附魔的迷宫
 */
public class EnchantedMazeGame extends MazeGame {

    public EnchantedMazeGame() {
    }

    @Override
    public Room makeRoom(Integer roomNo) {
        return new EnchantedRoom(roomNo, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell castSpell() {
        return new Spell();
    }
}
