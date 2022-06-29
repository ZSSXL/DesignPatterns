package com.zss.cp.base;

import com.zss.cp.common.AbstractMapSite;

/**
 * @author ZSS
 * @date 2021/4/19 11:29
 * @desc 描述一个房间的每一面所出现的门
 */
public class Door extends AbstractMapSite {

    private Room roomNo1;

    private Room roomNo2;

    private Boolean isOpen;

    public Door(Room roomNo1, Room roomNo2) {

    }

    public Door(Integer roomNumber) {
        super();
    }

    public Room otherSideFrom(Room room) {
        return null;
    }

    @Override
    public Door clone (){
        return new Door(this.roomNo1, this.roomNo2);
    }
}
