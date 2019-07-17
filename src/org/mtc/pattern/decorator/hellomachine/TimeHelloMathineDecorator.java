package org.mtc.pattern.decorator.hellomachine;

/**
 * 	HelloMathine 的计时器装饰类
 */
public class TimeHelloMathineDecorator extends HelloMathineDecorator {

	public TimeHelloMathineDecorator(HelloMachine helloMachine) {
		super(helloMachine);
	}

	@Override
	public void sayHello() {

		long time = System.currentTimeMillis();
		super.sayHello();
		System.out.println("耗时 " + (System.currentTimeMillis() - time) + " 毫秒");
	}
}
