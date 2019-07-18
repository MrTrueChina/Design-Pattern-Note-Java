package org.mtc.pattern.facade.drawer;

/**
 * 	所有绘制类的外观类
 */
public class Drawer {

	private LineDrawer _lineDrawer = new LineDrawer();
	private QuadDrawer _quadDrawer = new QuadDrawer();
	private RoundDrawer _roundDrawer = new RoundDrawer();

	public void drawLine() {
		_lineDrawer.draw();
	}

	public void drawQuad() {
		_quadDrawer.draw();
	}

	public void drawRound() {
		_roundDrawer.draw();
	}
}
