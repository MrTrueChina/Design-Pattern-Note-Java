package org.mtc.pattern.prototype.change;

/**
 * 	需要从外部读取数据创建的类的工厂，这个工厂基于原型模式提供只读取一次外部数据，之后无论外部数据如何变化都不会跟随变化的对象
 */
public class ChangeFactory {

	private static ChangeObject prototype = new ChangeObject(ChangeResource.getNumber());

	public static ChangeObject getChangeObject() {
		try {
			return prototype.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
