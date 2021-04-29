package com.zss.cp.base.sub;

import com.zss.cp.base.Room;
import com.zss.cp.common.Spell;

/**
 * @author ZSS
 * @date 2021/4/19 16:24
 * @desc
 */
public class EnchantedRoom extends Room {

    public EnchantedRoom(Integer roomNo, Spell spell) {
        super(roomNo);
    }

    protected Spell castSpell() {
        return null;
    }
}
