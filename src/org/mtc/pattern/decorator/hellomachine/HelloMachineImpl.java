package org.mtc.pattern.decorator.hellomachine;

/**
 * 	一个只会说 Hello 的类，装饰器模式中被装饰的类
 */
public class HelloMachineImpl implements HelloMachine{

	@Override
	public void sayHello() {
		System.out.println("I'm Hello Machine");
		for (int i = 0; i < 100; i++)
			System.out.println("Hello World!");
	}
}
