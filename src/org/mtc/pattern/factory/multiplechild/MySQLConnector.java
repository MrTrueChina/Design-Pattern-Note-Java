package org.mtc.pattern.factory.multiplechild;

/**
 * 假设这是MySQL的连接器<br/>
 * 虽然这里是自写的，但实际上MySQL的连接器是MySQL提供的，也就是说这个连接器随时都有可能发生不可预知的变化，无法预测变化的部分一定要和主体代码隔离开来
 */
public class MySQLConnector implements Connector {

	/*
	 * 	假设MySQL连接器需要这么多参数
	 */
	private String url;
	private String username;
	private String password;
	private int port;
	private String key;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String selectAll() {
		return "all data";
	}

	@Override
	public String toString() {
		return "MySQLConnector [url=" + url + ", username=" + username + ", password=" + password + ", port=" + port
				+ ", key=" + key + "]";
	}
}
