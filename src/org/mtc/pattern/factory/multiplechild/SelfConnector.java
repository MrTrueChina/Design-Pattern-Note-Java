package org.mtc.pattern.factory.multiplechild;

/**
 * 假设这是一个自研的数据库的连接器<br/>
 * 虽然这是个自写的连接器，但数据库总要更新，连接器也要跟着更新，变化必然会发生，频率和程序更新几乎不可能同步，因此也需要和主体隔离开
 */
public class SelfConnector implements Connector {

	/**
	 * 自研的数据库有这些属性
	 */
	private String username;
	private String password;
	private int port;
	private String key;
	private int level;

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

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String selectAll() {
		return "all data";
	}

	@Override
	public String toString() {
		return "SelfConnector [username=" + username + ", password=" + password + ", port=" + port
				+ ", key=" + key + ", level=" + level + "]";
	}
}
