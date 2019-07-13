package org.mtc.pattern.prototype.tooexpensive;

/**
 * 	非常昂贵的类的对象的工厂，原型模式一般需要一个工厂来负责生产对象
 */
public class TooExpensiveFactory {

	private static final TooExpensiveObject prototype = new TooExpensiveObject(100);

	public static TooExpensiveObject getTooExpensiveObject() {
		try {
			return prototype.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
