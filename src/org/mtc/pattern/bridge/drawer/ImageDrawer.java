package org.mtc.pattern.bridge.drawer;

import org.mtc.pattern.bridge.tomatrix.ImageToMatrix;

/**
 * 	绘制图片的抽象类
 */
public abstract class ImageDrawer {

	/**
	 * 	将图片转为矩阵的对象
	 */
	protected ImageToMatrix _toMatrix; // 保存图片转矩阵步骤的对象，用于和实现类的显示功能组合

	/**
	 * @param toMatrix 用于将图片转为矩阵信息的对象
	 */
	public ImageDrawer(ImageToMatrix toMatrix) {
		_toMatrix = toMatrix;
		// 通过构造将部分逻辑对象传进来存入是桥接模式的经典步骤，当然不是必须的，只要能保证获取到对象，具体过程并不重要
	}

	/**
	 * 	将制定图片绘制到所在平台上<br/>
	 * 	需要注意这个方法是final的，因为这个方法负责执行图片转矩阵和绘制矩阵两个步骤，也就是两个逻辑联系的执行部分，这个部分在所有子类中必须一致，否则将无法保证子类的逻辑关系正确
	 * 	这个方法就像是连接两个模式的桥梁，这就是“桥接”这个名字的来源
	 * 
	 * @param imageFile
	 */
	public final void draw(String imageFile) {

		String matrix = _toMatrix.toMatrix(imageFile);

		drawMatrix(matrix);
	}

	/**
	 * 	将矩阵绘制到所在平台上
	 * @param matrix
	 */
	protected abstract void drawMatrix(String matrix);
}
