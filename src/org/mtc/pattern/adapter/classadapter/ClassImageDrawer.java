package org.mtc.pattern.adapter.classadapter;

/**
 * 	图片显示接口<br/>
 * 	接口模式中最终的目标，具有新旧所有功能的接口
 */
public interface ClassImageDrawer {

	/**
	 * 	绘制nbi图片
	 */
	public void drawNbi();

	/**
	 * 	绘制png图片
	 */
	public void drawPng();

	/**
	 * 	绘制jpg图片
	 */
	public void drawJpg();

	/**
	 * 绘制bmp图片
	 */
	public void drawBmp();
}
