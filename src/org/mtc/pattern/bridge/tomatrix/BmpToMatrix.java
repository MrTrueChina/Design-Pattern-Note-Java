package org.mtc.pattern.bridge.tomatrix;

/**
 * 	将.bmp 图片文件转为矩阵的类
 */
public class BmpToMatrix implements ImageToMatrix{

	@Override
	public String toMatrix(String file) {
		
		//图片转显示矩阵这种水平的代码我当然写不出来，返回一个字符串表示一下进行了转化
		
		return file + "的显示矩阵";
	}
}
