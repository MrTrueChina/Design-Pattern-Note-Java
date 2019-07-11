package org.mtc.pattern.factory.multiplechild;

/**
 * 用这个类来顶替配置文件
 */
public final class Resources {

	private Resources() {
	}

	/**
	 * 决定使用哪种数据库的属性，如果配成MySQL就是使用MySQL，配成self则是使用自研数据库，因为有工厂负责创建连接器，才可以仅仅通过修改一个配置就切换数据库
	 */
	public static final String TYPE = "self";
	public static final String URL = "url";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final int PORT = 3306;
	public static final String KEY = "a5q8-dfwx-qjk9-q84s-26q4";
	public static final int LEVEL = 5;
}
