package org.mtc.pattern.proxy.image;

/**
 * 	模拟从数据库中取出图片的类，代理模式中被代理的类
 */
public class ImageGetterDatabase implements ImageGetter{

	@Override
	public String getImage() {
		
		return "Hello World.jpg";
	}
}
