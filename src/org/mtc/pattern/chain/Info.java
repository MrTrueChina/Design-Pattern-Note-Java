package org.mtc.pattern.chain;

/**
 * 	信息类
 */
public class Info {

	private String _info;
	private int _level;

	public Info(String info, int level) {
		super();
		_info = info;
		_level = level;
	}

	public String getInfo() {
		return _info;
	}

	public void setInfo(String info) {
		_info = info;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}
}
