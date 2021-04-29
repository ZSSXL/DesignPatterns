package com.zss.cp.factory.product;

import com.zss.cp.factory.BaseWidgetFactory;

/**
 * @author ZSS
 * @date 2021/4/19 14:56
 * @desc PM -- Presentation Manager
 */
public class PMWidgetFactory extends BaseWidgetFactory {

    @Override
    public void createScrollBar() {
        System.out.println("Create ScrollBar with PM");
    }

    @Override
    public void createWindow() {
        System.out.println("Create Window with PM");
    }
}
