package org.mtc.pattern.flyweight.test;

/**
 * 	圆绘制器
 */
public class RoundDrawer implements Drawer {

	private int _x, _y, _radius;

	public RoundDrawer(int x, int y, int radius) {
		_x = x;
		_y = y;
		_radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("画圆 " + toString());
	}

	@Override
	public String toString() {
		return "RoundDrawer [x=" + _x + ", y=" + _y + ", radius=" + _radius + "]";
	}
}
