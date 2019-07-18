package org.mtc.pattern.decorator.hellomachine;

/**
 * 	HelloMathine 的计时器装饰类
 */
public class TimeHelloMathine implements HelloMachine {

	protected HelloMachine _helloMachine;

	public TimeHelloMathine(HelloMachine helloMachine) {
		_helloMachine = helloMachine;
	}

	@Override
	public void sayHello() {

		long time = System.currentTimeMillis();
		
		_helloMachine.sayHello(); // 在方法中调用被包装类的被包装的方法，这样才算是包装了起来，不然就是替换了
		
		System.out.println("耗时 " + (System.currentTimeMillis() - time) + " 毫秒");
	}
}
