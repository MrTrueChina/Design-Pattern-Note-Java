package org.mtc.pattern.abstractfactory;

import java.awt.Color;

import org.mtc.pattern.abstractfactory.drawer.drawerdo.UIDrawerDo;

/*
 * 	抽象工厂模式（Abstract Factory）：工厂模式升级版，由一个抽象工厂声明生产方法，由不同的实现工厂实现这些方法，每个实现工厂都能够生产全套产品，每个实现工厂的产品不同
 * 
 * 	这个模式用于一种不太多见的情况：为了实现一个功能，需要一整套对象，需求有多种变化，但无论哪种变化都需要完整的一套对象
 * 	比较容易理解的情况是UI主题，只有完整的一套UI才能正常使用软件，UI有多种主题可以切换，但无论哪种主题都需要完整的一套UI
 */
public class Main {

	private static final String STRING = "Hello World!";

	public static void main(String[] args) {

		demoWithFactory();
		System.out.println("/////////////////////////////////////////////////////////");
		demoWithAbstractFactory();
	}

	/**
	 * 使用普通工厂模式的演示方法
	 */
	private static void demoWithFactory() {

		UIDrawerDo drawer = new UIDrawerDo();

		drawer.drawBackground(Color.RED);
		drawer.drawSearch(Color.RED);
		drawer.drawText(Color.BLACK, STRING);

		drawer.drawBackground(Color.BLACK);
		drawer.drawSearch(Color.BLACK);
		drawer.drawText(Color.WHITE, STRING);

		drawer.drawBackground(Color.WHITE);
		drawer.drawSearch(Color.WHITE);
		drawer.drawText(Color.BLACK, STRING);
		
		// 使用普通工厂模式，每次调用时都需要传参数，每次的参数需要保证正确才能保证最终成果不出错
	}

	/**
	 * 使用抽象工厂模式的演示方法
	 */
	private static void demoWithAbstractFactory() {

		UIDrawer drawer;

		Resources.setUiStyle(UIStyle.RED);
		drawer = UIDrawer.getDrawer();
		drawer.drawBackground();
		drawer.drawSearch();
		drawer.drawText(STRING);

		Resources.setUiStyle(UIStyle.WHITE);
		drawer = UIDrawer.getDrawer();
		drawer.drawBackground();
		drawer.drawSearch();
		drawer.drawText(STRING);

		Resources.setUiStyle(UIStyle.BLACK);
		drawer = UIDrawer.getDrawer();
		drawer.drawBackground();
		drawer.drawSearch();
		drawer.drawText(STRING);
		
		/*
		 * 	使用抽象工厂模式，只需要先设置主题，之后通过抽象工厂获取实现工厂再调用方法，就可以保证最终成品的一致性
		 * 	并且这个过程中使用者只需要传一个参数就可以决定风格，不需要知道到底有多少个风格，他们都是什么实现工厂
		 */
		
		/*
		 * 	实际上使用UI来演示抽象工厂并不是很适合，因为UI可以通过读取资源文件的方式用一个工厂完成
		 * 	抽象工厂模式最好的例子是对不同平台版本的软件的编译，由于不同平台的区别，编译过程是无法使用配置文件来设置的，用抽象工厂来调用针对平台的工厂编译就十分合理了
		 */
	}
}
