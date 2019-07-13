package org.mtc.pattern.prototype.change;

/**
 * 	需要从外部读取数据创建的类<br/>
 * 	这个类通同样通过实现 Cloneable 接口实现复制
 */
public class ChangeObject implements Cloneable {

	private int _number;

	public ChangeObject(int number) {
		_number = number;
	}

	public void work() {
		System.out.println(this + " 执行工作方法：number = " + _number);
	}

	@Override
	protected ChangeObject clone() throws CloneNotSupportedException {
		
		ChangeObject newObject = (ChangeObject) super.clone();

		newObject._number = _number;

		return newObject;
	}
}
