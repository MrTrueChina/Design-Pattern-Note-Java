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
	public void draw(String imageFile) {

		String matrix = _toMatrix.toMatrix(imageFile);

		System.out.println("在Linux系统上，绘制 [" + imageFile + "] 图片，矩阵信息为 [" + matrix + "]");
	}
}
