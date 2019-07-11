package org.mtc.pattern.factory.simplifycreate;

/**
 * 创建对象的工厂类
 */
public final class Factory {

	private Factory() {
	}

	public static Product getProduct(int size) {

		Product product = new Product();

		product.setUrl(Resources.URL); // 三个通过Resources类获取的参数用于模拟实际使用时的配置文件或配置类，这些配置提供了大量的共性可供提取
		product.setIp(Resources.IP);
		product.setPort(Resources.PORT);

		product.setSize(size); // 这个属性通过外部传入，不是共性，如果有大量这样的属性，一定要仔细考虑工厂模式是不是可以简化代码

		product.start(); // 这个方法必须在所有数据存入后执行，而且这个对象要想正常使用必须要先执行这个方法，这也是可以提取的共性

		return product;
	}
}
