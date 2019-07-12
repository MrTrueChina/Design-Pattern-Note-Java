package org.mtc.pattern.singleton;

/**
 * 	计数器，“懒汉式”单例模式的类，看这个类之前请先看 Singleton 类
 * 
 * 	“懒汉式”是指实例直到需要的时候才加载，这种设计可以减轻“饿汉式”对象随类加载带来的资源占用，不过相对的会损失很少的一点速度
 * 	“懒汉式”最大的问题在于一旦发生设计问题将很有可能在多线程环境下变为多例，进而导致功能错乱
 */
public class LazySingleton {

	private static LazySingleton _instance;

	/**
	 * 获取实例的方法，懒汉式通过这个方法来创建实例
	 * @return
	 */
	private static LazySingleton instance() {

		if (_instance != null)
			return _instance;

		////////危险的关键位置////////
		
		synchronized (LazySingleton.class) {
			if (_instance == null)
				_instance = new LazySingleton();
			/*
			 * 	这个if是懒汉式避免多线程变多例的关键
			 * 	为了应对多线程，获取实例的步骤不能同步，否则性能损失会极为严重
			 * 	为了保证只创建单个实例，需要在创建的时候同步，保证只有一个线程创建
			 * 
			 * 	然而，问题没有这么容易解决
			 * 
			 * 	如果运气够背，就会有线程在前面的 //危险的关键位置// 停下来，之后别的线程进入同步部分创建了对象
			 * 	等这个线程再次执行时他马上就会进入同步部分，但此时对象已经创建了，如果这个线程再创建一个马上就会出现多例
			 * 	因此需要在同步代码内部再加一个if拦住这些倒霉的线程，这样就可以防止出现多例
			 */
		}

		return _instance;
	}

	private int _count;

	public static void add() {
		instance()._count++;
	}

	public static int getCount() {
		return instance()._count;
	}
}
