package com.zss.cp.base;

import com.zss.cp.common.AbstractMapSite;
import com.zss.cp.constant.Direction;

/**
 * @author ZSS
 * @date 2021/4/19 10:41
 * @desc 房间 -- 指向其他MapSite对象的引用，并保存一个房间号，这个数字用来标识迷宫中的房间。
 */
@SuppressWarnings("unused")
public class Room extends AbstractMapSite {

    private AbstractMapSite[] sites;

    private Integer roomNumber;

    public Room(Integer roomNo) {
    }

    public AbstractMapSite getSide() {
        return null;
    }

    public void setSites(Direction direction, AbstractMapSite mapSite) {

    }

    @Override
    public void enter() {
    }

    @Override
    public Room clone(){
        return new Room(this.roomNumber);
    }
}
