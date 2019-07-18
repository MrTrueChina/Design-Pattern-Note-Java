package org.mtc.pattern.decorator.hellomachine;

/**
 * 	一个只会说 Hello 的接口<br/>
 * 	这个接口作为被装饰类和装饰类共同的父级，外部调用时通过这个接口调用，便于隐藏内部实现
 */
public interface HelloMachine {

	public void sayHello();
}
