package org.mtc.pattern.abstractfactory;

import org.mtc.pattern.abstractfactory.drawer.BlackUIDrawer;
import org.mtc.pattern.abstractfactory.drawer.RedUIDrawer;
import org.mtc.pattern.abstractfactory.drawer.WhiteUIDrawer;

/**
 * UI绘制器，抽象工厂，负责定义方法
 */
public interface UIDrawer {
	/**
	 * 绘制搜索框
	 */
	public void drawSearch();

	/**
	 * 绘制背景
	 */
	public void drawBackground();

	/**
	 * 绘制文字
	 * 
	 * @param string
	 */
	public void drawText(String string);

	/**
	 * 获取绘制器
	 * 
	 * @return
	 */
	public static UIDrawer getDrawer() {
		switch (Resources.getUiStyle()) {
		
		case RED:
			return new RedUIDrawer();

		case BLACK:
			return new BlackUIDrawer();

		case WHITE:
			return new WhiteUIDrawer();

		default:
			throw new IllegalArgumentException("Unexpected value: " + Resources.getUiStyle());
		}
	}
}
