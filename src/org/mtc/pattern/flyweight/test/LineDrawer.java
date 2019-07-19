package org.mtc.pattern.flyweight.test;

/**
 * 	线绘制器
 */
public class LineDrawer implements Drawer {

	@Override
	public void draw() {
		System.out.println("画线");
	}
}
