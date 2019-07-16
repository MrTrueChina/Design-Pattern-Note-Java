package org.mtc.pattern.bridge.drawer;

import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;

/**
 * 	绘制图片的抽象类
 */
public abstract class ImageDrawer {

	protected ImageToMatrix _toMatrix;

	/**
	 * @param toMatrix 用于将图片转为矩阵信息的对象
	 */
	public ImageDrawer(ImageToMatrix toMatrix) {
		_toMatrix = toMatrix;
	}

	/**
	 * 	将制定图片绘制到所在平台上
	 * 
	 * @param imageFile
	 */
	public abstract void draw(String imageFile);
}
