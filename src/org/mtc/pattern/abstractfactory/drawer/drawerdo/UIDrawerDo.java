package org.mtc.pattern.abstractfactory.drawer.drawerdo;

import java.awt.Color;

/**
 * 最终负责绘制UI的类，也是普通的工厂模式的工厂
 */
public class UIDrawerDo {

	/**
	 * 绘制搜索框
	 * 
	 * @param color 搜索框颜色
	 */
	public void drawSearch(Color color) {
		System.out.println("绘制 " + color + " 颜色的搜索框");
	}

	/**
	 * 绘制背景
	 * 
	 * @param color 背景的颜色
	 */
	public void drawBackground(Color color) {
		System.out.println("绘制 " + color + " 颜色的背景");
	}

	/**
	 * 绘制文字
	 * 
	 * @param color 文字的颜色
	 * @param string 要绘制的文字
	 */
	public void drawText(Color color, String string) {
		System.out.println("绘制 " + color + " 颜色的字符串 \"" + string + "\"");
	}
}
