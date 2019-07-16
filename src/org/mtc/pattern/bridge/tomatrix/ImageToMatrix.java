package org.mtc.pattern.bridge.tomatrix;

/**
 * 	将图片文件转为显示矩阵信息的接口
 */
public interface ImageToMatrix {

	/**
	 * 将图片文件转为用于显示的矩阵信息
	 * 
	 * @param file 图片文件，为了简化代码，用字符串代表图片文件
	 * @return 转化后的可以用于显示的矩阵信息，为了简化代码，同样使用字符串代表矩阵信息
	 */
	public String toMatrix(String file);
}
