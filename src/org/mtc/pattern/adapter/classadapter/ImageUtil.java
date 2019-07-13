package org.mtc.pattern.adapter.classadapter;

/**
 * 	假设这是个第三方的图片绘制，可以绘制png、jpg、bmp格式的图片<br/>
 * 	适配器模式中的被适配者
 */
public class ImageUtil {

	/**
	 * 	绘制png图片
	 */
	public void drawPng() {
		System.out.println("绘制 png 图片");
	}
	
	/**
	 * 	绘制jpg图片
	 */
	public void drawJpg() {
		System.out.println("绘制 jpg 图片");
	}
	
	/**
	 * 绘制bmp图片
	 */
	public void drawBmp() {
		System.out.println("绘制 bmp 图片");
	}
}
