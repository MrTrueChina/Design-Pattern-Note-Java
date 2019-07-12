package org.mtc.pattern.abstractfactory.drawer;

import java.awt.Color;

import org.mtc.pattern.abstractfactory.UIDrawer;
import org.mtc.pattern.abstractfactory.drawer.drawerdo.UIDrawerDo;

/**
 * 红色主题的UI的绘制器，实现工厂之一
 */
public class RedUIDrawer implements UIDrawer {
	
	private UIDrawerDo _drawer = new UIDrawerDo();

	@Override
	public void drawSearch() {
		_drawer.drawSearch(Color.RED);
	}

	@Override
	public void drawBackground() {
		_drawer.drawSearch(Color.RED);
	}

	@Override
	public void drawText(String string) {
		_drawer.drawText(Color.BLACK, string);
	}
}
