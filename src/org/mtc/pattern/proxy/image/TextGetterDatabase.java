package org.mtc.pattern.proxy.image;

/**
 * 	模拟从数据库中取出文本的类，代理模式中被代理的类
 */
public class TextGetterDatabase implements TextGetter{

	@Override
	public String getText() {
		
		System.out.println("从数据库中取出文本");
		
		return "Hello World!";
	}
}
