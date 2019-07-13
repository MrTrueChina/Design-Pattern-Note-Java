package org.mtc.pattern.prototype.change;

/**
 * 	模拟外部数据的类
 */
public class ChangeResource {

	private static int _number = 100;

	/**
	 * 	获取数据，模拟从外部资源文件获取数据
	 */
	public static int getNumber() {
		return ChangeResource._number;
	}

	/**
	 * 	存入数据，模拟外部数据被其他人改变
	 */
	public static void setNumber(int number) {
		ChangeResource._number = number;
		System.out.println("外部数据发生改变，number = " + _number);
	}
}
