package org.mtc.pattern.decorator;

import org.mtc.pattern.decorator.hellomachine.HelloMachine;
import org.mtc.pattern.decorator.hellomachine.HelloMachineFactory;

/*
 * 	装饰器模式（Decorator）：用一个装饰类把被装饰类打包，被装饰类的方法在装饰类中都有实现，装饰类可以扩展被装饰类的方法
 * 
 * 	装饰器模式的效果和直接继承十分相似，这个模式就是为了在不继承的情况下完成对类的方法的扩展而出现的
 * 	因为没有继承关系，装饰类和被装饰类可以分别改变
 * 	因为没有继承关系，实现结构的隐藏就稍微要费点功夫，可以考虑加一个接口做装饰类和被装饰类的共同父类，然后用工厂把创建过程藏起来
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		HelloMachine helloMachine = HelloMachineFactory.getHelloMachine();
		
		helloMachine.sayHello();
	}
}
