package org.mtc.pattern.factory.simplifycreate;

/*
 * 	工厂模式（Factory）：将对象的创建过程提取到一个单独的类里，将创建和使用分离，创建过程越复杂收益越大
 * 
 * 	工厂模式显而易见的好处：简化对象创建
 * 
 * 	有的类创建对象到使用需要经过很多工序，比如连接数据库的对象、联网的对象，他们都需要在创建后经过几个步骤建立连接后才能投入使用
 * 	对于这些对象如果每次都写出一大串语句必然会导致代码混乱、修改困难
 * 	如果这些操作有足够多的相同之处，我们就可以写一个工厂类来负责创建对象，大幅降低复杂度
 * 
 * 	这个用法是非常常见的用法，很多人已经用了工厂模式但不知道正在用工厂模式
 * 
 * 	需要注意这个效果建立在“有共同点”的基础上，如果创建对象到可以使用之间的操作提取不出相同点，那么工厂模式是无法简化这个过程的
 */
public class Main {
	public static void main(String[] args) {

		demoWithOutFactory();
		demoWithFactory();
	}

	/**
	 * 不使用工厂模式的演示方法
	 */
	private static void demoWithOutFactory() {

		final int size1 = 1024;
		final int size2 = 4096;

		///////////////创建过程///////////////
		
		Product product1 = new Product();
		product1.setUrl(Resources.URL);
		product1.setIp(Resources.IP);
		product1.setPort(Resources.PORT);
		product1.setSize(size1);
		product1.start();

		Product product2 = new Product();
		product2.setUrl(Resources.URL);
		product2.setIp(Resources.IP);
		product2.setPort(Resources.PORT);
		product2.setSize(size2);
		product2.start();
		
		////直接在方法里创建并设置，一个对象6行////
		
		product1.work();
		product2.work();
	}

	/**
	 * 使用工厂模式的演示方法
	 */
	private static void demoWithFactory() {

		final int size1 = 1024;
		final int size2 = 4096;

		///////////////创建过程///////////////
		
		Product product1 = Factory.getProduct(size1);
		Product product2 = Factory.getProduct(size2);
		
		//////使用工厂创建，一个对象只要一行//////
		
		product1.work();
		product2.work();
	}
}
