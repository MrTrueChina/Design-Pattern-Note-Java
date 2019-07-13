package org.mtc.pattern.adapter.classadapter;

/**
 * 	jpg、png、bmp、nbi类型的图片显示类<br/>
 * 	适配器模式中的适配器<br/>
 * 
 * 	在类适配器模式中，适配器最好能够继承所有需要适配的类，形成一个控制器一样的类<br/>
 * 	但这种效果只有在多继承语言才能实现，单继承语言智能继承旧的类，实现新的功能的接口<br/>
 * 	这一特性限制了适配器模式最为酷炫的应用方式：将多个类合并到一起，形成一个超级控制器，一个对象掌控全场
 */
public class JPBNImageDrawer extends ImageUtil implements ClassImageDrawer{

	/**
	 * 	绘制 nbi 图片
	 */
	@Override
	public void drawNbi() {
		System.out.println("绘制 nbi 图片");
	}
}
