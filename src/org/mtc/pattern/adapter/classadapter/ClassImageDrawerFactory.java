package org.mtc.pattern.adapter.classadapter;

/**
 * 	类适配器的工厂类，工厂不是类适配器的必须部分，但类适配器对象的创建略为特殊，适合使用工厂进行封装
 */
public class ClassImageDrawerFactory {

	/**
	 * 	获取图片绘制接口实现类对象
	 * 
	 * 	@return
	 */
	public static ClassImageDrawer getImageDrawer() {
		return new JPBNImageDrawer(); // 这个方法实际创建了 JPBNImageDrawer，但返回 ClassImageDrawer 接口，这样在调用时看起来就像是一个普通的一体化的类，而不是拼接到一起的适配器
	}
}
