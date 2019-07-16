package org.mtc.pattern.bridge.drawer;

import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;

/**
 * 	Windows系统上的绘制图片的类
 */
public class WindowsDrawer extends ImageDrawer {

	public WindowsDrawer(ImageToMatrix toMatrix) {
		super(toMatrix);
	}

	@Override
	public void draw(String imageFile) {

		String matrix = _toMatrix.toMatrix(imageFile);

		System.out.println("在Windows系统上，绘制 [" + imageFile + "] 图片，矩阵信息为 [" + matrix + "]");
	}
}
