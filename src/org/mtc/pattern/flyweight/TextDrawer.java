package org.mtc.pattern.flyweight;

/**
 * 	以指定字体、指定颜色绘制指定文字的工具对象类
 */
public class TextDrawer {

	/**
	 * 	字体，假定这个属性是不可变动的
	 */
	private String _font;

	/**
	 * 	颜色，假定这个属性可以设置，但绘制时不传参
	 */
	private String _color;

	public TextDrawer(String font, String color) {
		_font = font;
		_color = color;
	}

	public void setColor(String color) {
		_color = color;
	}

	public void draw(String text) {

		System.out.println("【绘制】以 [" + _font + "] 字体绘制颜色为 [" + _color + "] 的文本 [" + text + "]");
	}
}
