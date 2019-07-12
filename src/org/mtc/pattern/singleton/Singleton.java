package org.mtc.pattern.singleton;

/**
 * 	计数器，一般的单例模式的类
 * 
 * 	一般的单例模式又名“饿汉式”，类的实例在类加载的时候就产生了
 * 
 * 	这个例子体现的是创建对象消耗过大而实际只需要一个的情况
 * 	有时候会遇到另一种情况：有一个很重要的功能是非静态的，为了使用这个功能必须有对象，但对象只要一个就足够了，这时候也可以用单例
 */
public class Singleton {

	private static Singleton _instance = new Singleton(); // 在类初始化时就创建实例并保存下来

	private int _count = 0;

	private Singleton() {
		/*
		 * 	请想象这个对象在构造时要进行多到恐怖的操作
		 * 	比如连接20个数据库并查500个表
		 * 	然后在互联网上爬10个搜索引擎的搜索结果
		 * 	之后又写了1个启动记录
		 * 	以上操作耗时至少5分钟
		 */
	}

	public static void add() {
		_instance._count++; // 调用方法时通过对实例的操作完成方法的执行过程
	}

	public static int getCount() {
		return _instance._count;
	}
}
