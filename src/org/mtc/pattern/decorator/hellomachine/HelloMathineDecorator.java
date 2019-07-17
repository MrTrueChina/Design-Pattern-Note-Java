package org.mtc.pattern.decorator.hellomachine;

/**
 * 	HelloMachine 的装饰器类
 */
public abstract class HelloMathineDecorator implements HelloMachine {

	protected HelloMachine _helloMachine;

	public HelloMathineDecorator(HelloMachine helloMachine) {
		_helloMachine = helloMachine;
	}

	@Override
	public void sayHello() {
		_helloMachine.sayHello();
	}
}
