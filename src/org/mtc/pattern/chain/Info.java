package org.mtc.pattern.chain;

/**
 * 	信息类
 */
public class Info {

	private String _message;
	private int _level;

	public Info(String message, int level) {
		super();
		_message = message;
		_level = level;
	}

	public String getMessage() {
		return _message;
	}

	public void setMessage(String info) {
		_message = info;
	}

	public int getLevel() {
		return _level;
	}

	public void setLevel(int level) {
		_level = level;
	}
}
