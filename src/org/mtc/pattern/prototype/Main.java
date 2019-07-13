package org.mtc.pattern.prototype;

import org.mtc.pattern.prototype.change.ChangeFactory;
import org.mtc.pattern.prototype.change.ChangeObject;
import org.mtc.pattern.prototype.change.ChangeResource;
import org.mtc.pattern.prototype.tooexpensive.TooExpensiveFactory;
import org.mtc.pattern.prototype.tooexpensive.TooExpensiveObject;

/*
 * 	原型模式（Prototype）：创建一个对象作为原型，之后所有创建的对象不经过创建而是直接复制原型
 * 
 * 	原型模式主要用于应对两种情况：
 * 	1.对象初始化过程成本过于高昂，但又无法使用单例模式
 * 	2.对象通过外部配置文件或第三方提供，可能由于外部原因导致对象发生变化，但执行过程中对象必须一致
 * 
 * 	使用原型模式需要了解开发语言的对象复制方式，并且一定要辨别出每个方法是浅复制还是深复制
 * 
 * 	我的两个演示都是使用的 clone()，这是浅复制的方法
 */
public class Main {
	public static void main(String[] args) {

		tooExpensiveDemo();
		System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		changeDemo();
	}

	/**
	 * 	对象初始化过于高昂情况的演示
	 */
	private static void tooExpensiveDemo() {

		TooExpensiveObject expensiveObject1 = TooExpensiveFactory.getTooExpensiveObject();
		TooExpensiveObject expensiveObject2 = TooExpensiveFactory.getTooExpensiveObject();

		expensiveObject1.work();
		expensiveObject2.work();

		/*
		 * 	运行后可以看出三个现象：
		 * 	1.只执行了一次构造方法，也就是只消耗了半个小时
		 * 	2.两次获取的对象是不同的，也就是说不是单例
		 * 	3.用来模拟初始化结果的 number 相同，也就是说这两个对象都是正确的完成了初始化的状态
		 * 
		 * 	这就是原型模式的应用之一：绕过高昂的初始化过程，以低成本创建更多的对象
		 */
	}

	/**
	 * 	对象依赖于随时可能变化的外部资源的情况的演示
	 */
	private static void changeDemo() {

		ChangeObject changeObject1=ChangeFactory.getChangeObject();
		
		ChangeResource.setNumber(-100); // 模拟外部数据改动
		
		ChangeObject changeObject2=ChangeFactory.getChangeObject();
		
		changeObject1.work();
		changeObject2.work();
		
		/*
		 * 	运行后可以看到虽然数据在运行时发生了改变，但改动后获取的对象属性和改动前获取的属性是相同的，并没有随着外部数据的变化而变化
		 * 
		 * 	这就是原型模式的应用之二：在读取一次外部数据后就断开对外部数据的依赖，使得程序不会因为外部数据的变化而发生预期之外的变化
		 */
	}
}
