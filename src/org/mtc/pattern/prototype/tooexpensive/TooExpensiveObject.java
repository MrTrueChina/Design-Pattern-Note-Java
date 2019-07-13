package org.mtc.pattern.prototype.tooexpensive;

import java.util.Random;

/**
 * 	一个对象创建和初始化过程极其昂贵的类<br/>
 * 	这个类通过实现 Cloneable 接口进行复制
 */
public class TooExpensiveObject implements Cloneable {

	private int _number;

	/**
	 * 	非常昂贵的构造方法
	 */
	public TooExpensiveObject(int number) {

		// 让我们假装这个构造方法连接了800个数据库并进行了一次精确到原子级的全球天气预测，然后导致他用掉了半小时

		_number = new Random().nextInt(); // 用一个随机数代表前面一大堆操作得到的结果

		System.out.println("通过构造方法创建一个特别昂贵的对象，耗时半小时");
	}

	/**
	 * 	真正的工作代码
	 */
	public void work() {
		System.out.println("非常昂贵的对象 " + this + " 执行工作方法：number = " + _number);
	}

	/**
	 * 	复制对象的方法
	 */
	@Override
	protected TooExpensiveObject clone() throws CloneNotSupportedException {

		TooExpensiveObject newObject = (TooExpensiveObject) super.clone(); // 使用父类的 clone 方法获取对象，注意不要用 new 获取新对象，使用 new 不能跳过构造，不是复制对象

		newObject._number = _number; // 将这个对象的属性存到新对象里去，这样新的对象就跳过了初始化过程直接到达了初始化完成的状态

		return newObject;
	}
}
