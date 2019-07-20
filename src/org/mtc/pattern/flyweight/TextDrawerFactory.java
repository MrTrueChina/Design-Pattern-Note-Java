package org.mtc.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 	文字绘制对象的工厂
 */
public class TextDrawerFactory {

	/**
	 * 	储存绘制器对象的享元池，实际就是一个 属性:对象 的Map
	 */
	private static Map<String, TextDrawer> _drawers = new HashMap<String, TextDrawer>();

	public static TextDrawer getTextDrawer(String font, String color) {

		if (_drawers.containsKey(font))
			return getDrawerFromDrawers(font, color);
		return createAndReturnDrawer(font, color);
	}

	private static TextDrawer getDrawerFromDrawers(String font, String color) {

		TextDrawer drawer = _drawers.get(font);

		drawer.setColor(color); // 颜色是可变属性，可以在取出的时候进行设置

		return drawer;
	}

	private static TextDrawer createAndReturnDrawer(String font, String color) {

		System.out.println("【—创建—】创建字体为 [" + font + "]，颜色为 [" + color + "] 的绘制器");

		TextDrawer drawer = new TextDrawer(font, color);

		_drawers.put(font, drawer); // 字体是不可变属性，使用字体做Key

		return drawer;
	}
}
