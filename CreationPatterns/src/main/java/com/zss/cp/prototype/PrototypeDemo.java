package com.zss.cp.prototype;

/**
 * @author ZSS
 * @date 2021/5/31 16:35
 * @desc 原型 - Demo
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        Resume tom = new Resume("Tom");
        tom.setPersonal(24, "man");
        tom.setWorkExperience("2018-2021", "我为祖国造石油");

        Resume clone = tom.doClone();

        System.out.println("========================= Prototype =========================");
        System.out.println(tom);
        System.out.println("========================= Clone =========================");
        if(clone == null){
            System.out.println("对象克隆失败");
        } else {
            System.out.println(clone);
        }

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
