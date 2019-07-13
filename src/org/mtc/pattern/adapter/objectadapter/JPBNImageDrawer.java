package org.mtc.pattern.adapter.objectadapter;

/**
 * 	jpg、png、bmp、nbi类型的图片显示类<br/>
 * 	适配器模式中的适配器<br/>
 */
public class JPBNImageDrawer implements ObjectImageDrawer {

	private ImageUtil _imageUtil = new ImageUtil();
	/*
	 * 	在对象适配器模式中，适配器继承新功能接口，并将旧的代码的对象保存下来
	 * 	当调用新功能时，由适配器的新功能方法执行
	 * 	当调用旧功能时，由旧代码的对象来执行
	 */
	
	/**
	 * 	绘制png图片
	 */
	@Override
	public void drawPng() {
		_imageUtil.drawPng();
	}

	/**
	 * 	绘制jpg图片
	 */
	@Override
	public void drawJpg() {
		_imageUtil.drawJpg();
	}

	/**
	 * 	绘制bmp图片
	 */
	@Override
	public void drawBmp() {
		_imageUtil.drawBmp();
	}

	/**
	 * 	绘制 nbi 图片
	 */
	@Override
	public void drawNbi() {
		System.out.println("绘制 nbi 图片");
	}
}
