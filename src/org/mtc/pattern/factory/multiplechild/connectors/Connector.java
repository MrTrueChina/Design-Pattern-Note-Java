package org.mtc.pattern.factory.multiplechild.connectors;

/**
 * 	连接数据库的器接口，所有数据库连接器完全按照设计实现这个接口、工厂以这个接口做唯一的返回值，这是工厂模式的必须基础
 */
public interface Connector {

	/**
	 * 假设这就是查询数据的方法，为了简便，我们设定这个方法返回"all data"
	 */
	public String selectAll();
}
