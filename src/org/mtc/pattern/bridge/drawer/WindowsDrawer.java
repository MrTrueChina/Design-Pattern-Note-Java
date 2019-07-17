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
	protected void drawMatrix(String matrix) {
		
		//绘制矩阵我也不会写，写个输出当做绘制了矩阵

		System.out.println("在Windows系统上，绘制矩阵 [" + matrix + "]");
	}
}
