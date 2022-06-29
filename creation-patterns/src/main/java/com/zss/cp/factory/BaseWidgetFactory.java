package com.zss.cp.factory;

/**
 * 抽象工厂
 *
 * @author ZSS
 * @date 2021/4/19 14:44
 * @desc 部件类 -- 用来创建每一类基本窗口组件得接口
 * widget: 小部件
 */
public abstract class BaseWidgetFactory {

    public void createScrollBar(){
        System.out.println("Creat ScrollBar");
    }

    public void createWindow(){
        System.out.println("Create Window");
    }
}
