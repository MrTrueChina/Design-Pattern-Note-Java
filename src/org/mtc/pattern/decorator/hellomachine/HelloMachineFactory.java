package org.mtc.pattern.decorator.hellomachine;

/**
 * 	工厂，配合HelloMachine接口可以隐藏真实的实现
 */
public class HelloMachineFactory {

	private HelloMachineFactory() {
	}

	public static HelloMachine getHelloMachine() {
		return new TimeHelloMathine(new HelloMachineImpl());
	}
}
