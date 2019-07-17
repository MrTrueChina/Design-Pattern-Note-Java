package org.mtc.pattern.bridge.drawer;

import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;

/**
 * 	在Linux系统上绘制图片文件的类
 */
public class LinuxDrawer extends ImageDrawer {

	public LinuxDrawer(ImageToMatrix toMatrix) {
		super(toMatrix);
	}

	@Override
	protected void drawMatrix(String matrix) {

		System.out.println("在Linux系统上，绘制矩阵[" + matrix + "]");
	}
}
