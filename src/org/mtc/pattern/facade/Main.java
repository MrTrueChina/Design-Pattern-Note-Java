package org.mtc.pattern.facade;

import org.mtc.pattern.facade.drawer.Drawer;

/*
 * 	外观模式（Facade）：添加一个外观类，这个类负责系统和外部的交流
 * 
 * 	外观模式是一个特别有用的模式，他太泛用了
 * 	现有的接口调用复杂担心新手看不懂，加个简单的外观
 * 	功能拆开写合并的时候有好多个类，加个外观打包起来用
 * 	不少功能是内部的，不想让外部调用，加个功能少的外观
 * 	如果你感觉现在的类在外部使用的时候有不合适的地方，加外观基本能解决问题
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		Drawer drawer = new Drawer();

		drawer.drawLine();
		drawer.drawQuad();
		drawer.drawRound();
		
		/*
		 * 	虽然是三个类的方法，但有了外观类的掩盖，看起来就像是只有一个类一样
		 */
	}
}
