package org.mtc.pattern.bridge.drawer;

import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;

/**
 * 	在 MacOS 系统上绘制图片文件的类
 */
public class MacDrawer extends ImageDrawer {

	public MacDrawer(ImageToMatrix toMatrix) {
		super(toMatrix);
	}

	@Override
	protected void drawMatrix(String matrix) {

		System.out.println("在MaxOS系统上，绘制矩阵 [" + matrix + "]");
	}
}