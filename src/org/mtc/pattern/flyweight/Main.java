package org.mtc.pattern.flyweight;

import java.util.Random;

/*
 * 	享元模式（flyweight）：对于部分属性可以变化，部分属性不可修改的对象，根据不可修改属性建立对象池，在外部需要时返回池中对象，以节约资源
 * 
 * 	享元模式可以看做是单例模式的大幅升级版，这两个模式的目标都是尽可能的减少对象数量、减少创建过程，他们的效果都是节省内存、节约创建时间
 * 	享元模式用来解决单例模式的最大缺陷：单例模式的对象创建完全由类控制，这导致单例对象只有一种，如果实际情况需要多种对象，单例模式就无法应对了
 * 
 * 	享元模式解决这个问题的方法很简单：
 * 	首先对对象进行分析，分析出哪些属性可以由外部更改，那些属性不能由外部更改
 * 	分析完成后根据不能由外部修改的属性准备一个 Map，这个 Map 以这些属性为 key，对应一个个的单例对象
 * 	之后就可以参考单例模式，使用懒汉式或饿汉式来获取对象并存入 Map，当需要对象时根据属性取出对象即可
 * 
 * 	需要注意享元模式同样有单例模式的问题：对象使用周期必须错开，一旦一个对象同时在两个地方使用，将很有可能导致互相修改，一起出错
 */
public class Main {

	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		for (int i = 0; i < 20; i++)
			drawOnce();
	}

	private static void drawOnce() {
		
		String font = getRandomFont();
		String color = getRandomColor();

		System.out.println("【随机】随机字体为  [" + font + "]，颜色为 [" + color + "]");

		TextDrawer drawer = TextDrawerFactory.getTextDrawer(font, color);
		
		drawer.draw("Hello World!");
	}

	private static String getRandomFont() {
		
		String[] fonts = { "微软雅黑", "宋体", "华文仿宋", "楷书", "方正幼圆", "Consolas" };
		
		return fonts[new Random().nextInt(fonts.length)];
	}

	private static String getRandomColor() {
		
		String[] colors = { "黑色", "绿色", "红色", "黄色" };
		
		return colors[new Random().nextInt(colors.length)];
	}
}
