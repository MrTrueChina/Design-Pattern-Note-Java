package org.mtc.pattern.factory.multiplechild;

import org.mtc.pattern.factory.multiplechild.connectors.Connector;
import org.mtc.pattern.factory.multiplechild.connectors.MySQLConnector;
import org.mtc.pattern.factory.multiplechild.connectors.SelfConnector;

/**
 * 连接器的工厂类，根据配置创建连接器
 */
public final class ConnectorFectory {

	private ConnectorFectory() {
	}

	public static Connector getConnector() {

		switch (Resources.TYPE.toLowerCase()) {

		case "mysql":
			return getMySQLConnector();

		case "self":
			return getSelfConnector();

		default:
			throw new IllegalArgumentException("Unexpected value: " + Resources.TYPE.toLowerCase());
		}
	}

	private static Connector getMySQLConnector() {

		MySQLConnector connector = new MySQLConnector();

		connector.setUrl(Resources.URL);
		connector.setPort(Resources.PORT);
		connector.setUsername(Resources.USERNAME);
		connector.setPassword(Resources.PASSWORD);
		connector.setKey(Resources.KEY);

		// 请脑补这里还有一大堆各种各样的操作

		return connector;
	}

	private static Connector getSelfConnector() {

		SelfConnector connector = new SelfConnector();

		connector.setPort(Resources.PORT);
		connector.setUsername(Resources.USERNAME);
		connector.setPassword(Resources.PASSWORD);
		connector.setKey(Resources.KEY);
		connector.setLevel(Resources.LEVEL);

		// 请脑补这里还有一大堆各种各样的和MySQL连接器不一样的操作

		return connector;
	}
}
