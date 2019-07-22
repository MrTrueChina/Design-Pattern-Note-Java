package org.mtc.pattern.proxy;

import org.mtc.pattern.proxy.textgetter.TextCache;
import org.mtc.pattern.proxy.textgetter.TextGetter;
import org.mtc.pattern.proxy.textgetter.TextGetterFactory;

/*
 * 	代理模式（Proxy）：在内外部类之间增加一个代理类，内部类通过代理类和需要调用的类交流，代理类用于控制访问
 * 
 * 	代理模式和装饰器模式（Decorator）、外观模式（Facade）在实现上几乎一模一样，但他们的目的各不相同
 * 	装饰器用于给现有方法加功能；外观模式用于简化外部调用；代理模式则用于控制外部对内部的访问
 * 
 * 
 * 	代理模式的演示需要一个场景，我来编一个：
 * 
 * 	互联网时代，软件连上网比不联网好赚钱的多，俗话说没有钱万万不能，为了能早日赚够钱存银行吃利息然后辞职保头发，我们要做联网的软件
 * 	要联网就离不开数据库，一般来说数据库的速度比服务器快，但服务器堆叠更简单，最后反而是服务器速度远远地超过了数据库
 * 	此时有多种办法让服务器不需要完全依赖数据库运行从而让服务器全速运行，比如，使用缓存
 * 
 * 	假设从数据库取数据，简单起见就取一个字符串
 * 	为了加快速度，引入一个缓存，如果缓存里有数据则直接取缓存里的，没有则从数据库取数据并存入到缓存
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		TextCache cache = new TextCache();

		TextGetter textGetter = TextGetterFactory.getTextGetter(cache);

		for (int i = 0; i < 3; i++)
			System.out.println(textGetter.getText());
		/*
		 * 	三次循环，只有第一次从数据库中取数据，剩下两次直接从缓存取数据
		 * 	接口和工厂掩盖掉了代理模式，在外部是看不出使用了代理模式的
		 * 	这样就实现了通过代理模式对访问和执行的控制和修改
		 */
	}
}
