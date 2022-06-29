package com.zss.cp.factory.product;

import com.zss.cp.common.Spell;
import com.zss.cp.factory.BaseMazeFactory;
import com.zss.cp.base.Door;
import com.zss.cp.base.sub.DoorNeedingSpell;
import com.zss.cp.base.sub.EnchantedRoom;
import com.zss.cp.base.Room;

/**
 * @author ZSS
 * @date 2021/4/19 16:13
 * @desc 具体实现 -- 附魔的
 */
public class EnchantedMazeFactory extends BaseMazeFactory {

    public EnchantedMazeFactory (){

    }

    @Override
    public Room makeRoom(Integer roomNo) {
        return new EnchantedRoom(roomNo, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell castSpell (){
        return null;
    }
}
