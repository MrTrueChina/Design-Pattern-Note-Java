package org.mtc.pattern.singleton;

/*
 * 	单例模式（Singleton）：确保一个类在运行期间有且只有一个对象
 * 
 * 	有些类的功能要求这个类必须有对象、所有操作必须在一个对象上（比如计数器），此时需要使用单例模式
 * 	有些类创建对象消耗巨大，实际使用只需要一个对象，可以使用单例模式减少消耗
 * 	有些类作为工具类提供功能，但又要调用非静态方法时，可以使用单例模式简化调用
 * 
 * 	这个方式的原理极为简单：私有化构造方法让外部无法new对象，自己new一个存起来
 */
public class Main {
	public static void main(String[] args) {

		demoSingleton();
		demoLazySingleton();
	}
	
	private static void demoSingleton() {

		Singleton.add(); // 单例模式的方法直接通过静态调用，之后在内部转为对实例的操作，在外部完全可以当做静态类使用
		Singleton.add();
		
		System.out.println(Singleton.getCount());
	}
	
	private static void demoLazySingleton() {

		LazySingleton.add();
		LazySingleton.add();
		
		System.out.println(LazySingleton.getCount());
	}
}
