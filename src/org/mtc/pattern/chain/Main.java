package org.mtc.pattern.chain;

import org.mtc.pattern.chain.recorder.OperationalRecorder;

/*
 * 	责任链模式（Chain of Responsibility）：将多个可能能够处理请求的类连接成一条链，请求从头到尾传递，直到遇到能够处理的对象并由他处理
 * 	这个模式通过让请求在可能处理请求的类之间传递的方法将调用复杂度拉到最低，但同时会导致效率的下降，设计不当的情况下请求有可能传丢（所有类都处理不了）
 * 
 * 	抛异常就是责任链模式的一种应用，异常作为请求不断在继承形成的责任链上向上抛，直到遇到能够处理的类将异常处理掉，或者抛到最后抛给了虚拟机，程序崩溃
 * 
 * 
 * 	责任链模式同样需要一些演示场景，抛异常这种高水平的我写不来，我写一个信息记录
 * 
 * 	信息记录是一个很重要的系统，没有信息记录出了事你都不知道在哪出的，但有了信息记录你就能知道是被攻击了还是误操作了还是出了25仔了
 * 	如果你记录的是操作和数据快照的话那就更厉害了，你甚至能根据记录进行反向操作完成回滚
 * 
 * 	假设我们需要一个牛逼的记录系统，它有分级记录的能力，每个记录类记录等级不超过自己的信息，最后再加一个超级记录器，它不仅记录还要发消息
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		OperationalRecorder.record(new Info("用户[10086]登录", 0));
		OperationalRecorder.record(new Info("用户[10086]修改了登录密码", 1000));
		OperationalRecorder.record(new Info("用户[10086]修改了用户名", 1000));
		OperationalRecorder.record(new Info("用户[10086]退出登录", 0));
		OperationalRecorder.record(new Info("用户[10086]登录", 0));
		OperationalRecorder.record(new Info("用户[10086]通过支付宝支付了10086.00元", 2000));
		OperationalRecorder.record(new Info("用户[10086]通过支付宝支付了123.15元", 2000));
		OperationalRecorder.record(new Info("付款接口接收到不正确的参数！", Integer.MAX_VALUE));
	}
}
