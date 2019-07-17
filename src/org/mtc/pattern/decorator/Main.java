package org.mtc.pattern.decorator;

import org.mtc.pattern.decorator.hellomachine.HelloMachine;
import org.mtc.pattern.decorator.hellomachine.HelloMachineImpl;
import org.mtc.pattern.decorator.hellomachine.TimeHelloMathineDecorator;

/*
 * 	装饰器模式（Decorator）
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		HelloMachine helloMachine = new TimeHelloMathineDecorator(new HelloMachineImpl()); //TODO：需要工厂
		
		helloMachine.sayHello();
	}
}
