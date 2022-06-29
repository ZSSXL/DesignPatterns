package com.zss.cp.factory.product;

import com.zss.cp.factory.BaseWidgetFactory;

/**
 * @author ZSS
 * @date 2021/4/19 14:49
 * @desc motif - 风格
 */
public class MotifWidgetFactory extends BaseWidgetFactory {

    @Override
    public void createScrollBar() {
        System.out.println("Create ScrollBar with Motif");
    }

    @Override
    public void createWindow() {
        System.out.println("Create Window with Motif");
    }
}
