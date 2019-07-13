package org.mtc.pattern.adapter;

import org.mtc.pattern.adapter.classadapter.ClassImageDrawer;
import org.mtc.pattern.adapter.classadapter.ClassImageDrawerFactory;
import org.mtc.pattern.adapter.objectadapter.ObjectImageDrawer;
import org.mtc.pattern.adapter.objectadapter.ObjectImageDrawerFactory;

/*
 * 	适配器模式（Adapter）：当已有代码不能满足新的需求时，通过添加一个适配器类将已有代码和新代码合并为一个类，使旧代码可以与新代码合作使用
 * 	适配的过程实际是打包的过程，将新旧代码合为一个，使新的代码兼备旧的代码的功能，因此这个模式中的适配器类还有另一个称呼：包装（Wrapper）
 * 
 * 	这个设计模式用于原有设计无法应对新的变化时，在不修改原有代码的情况下让原有代码可以对接上新的变化
 * 	如果没有新的变化，则完全没有使用适配器模式的意义，因为直接使用旧的代码就可以满足需求
 * 	这个设计模式不适合在设计之初使用，如果设计时已经预见到必然需要的功能，那么应该在一开始就一起实现，而不是用新的代码实现然后再加一个适配器打包到一起
 * 	但如果设计时已经决定使用功能不足的第三方工具，那么适配器就成为必须考虑的元素了
 * 
 * 	这个设计模式需要一个特殊的情景，我们假设这么一个情景：
 * 	我们有一个显示图片的功能，本来这个功能是用的第三方的工具，能显示 jpg、png、bmp，足够应对主流图片了
 * 	此时天大的坏消息传来：一种新的非常牛逼的图片格式出现了，这个格式是 nbi，没有任何现成的免费的工具能显示他，但是公司经费又短缺了
 * 	于是现在需要自写一个 nbi 的显示工具并和之前的工具打包起来一起使用
 */
public class Main {
	public static void main(String[] args) {

		demoClass();
		demoObject();
	}

	/**
	 * 	类适配器的演示方法
	 */
	private static void demoClass() {
		ClassImageDrawer drawer = ClassImageDrawerFactory.getImageDrawer();
		
		drawer.drawJpg();
		drawer.drawPng();
		drawer.drawBmp();
		drawer.drawNbi();
		
		/*
		 * 	在适配器模式和工厂模式的配合下，使用者完全不会发现这是一个拼出来的对象
		 */
	}
	
	private static void demoObject() {
		ObjectImageDrawer drawer = ObjectImageDrawerFactory.getImageDrawer();
		
		drawer.drawJpg();
		drawer.drawPng();
		drawer.drawBmp();
		drawer.drawNbi();
	}
}
