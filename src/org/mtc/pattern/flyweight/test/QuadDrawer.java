package org.mtc.pattern.flyweight.test;

import java.awt.Rectangle;

/**
 * 	方块绘制器
 */
public class QuadDrawer implements Drawer {

	private Rectangle _rectangle;

	public QuadDrawer(int x,int y,int width,int height) {
		_rectangle = new Rectangle(x, y, width, height);
	}

	@Override
	public void draw() {
		System.out.println("画方 " + _rectangle);
	}
}
