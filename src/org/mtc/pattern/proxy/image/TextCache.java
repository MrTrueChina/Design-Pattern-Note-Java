package org.mtc.pattern.proxy.image;

/**
 * 	模拟缓存的类，实际使用时的缓存一般是用第三方的，因为自己写成本高效果还不一定好
 */
public class TextCache {

	private String _text = null;

	public void setText(String text) {
		_text = text;
	}

	public String getText() {
		System.out.println("从缓存中取出文本");
		return _text;
	}
}
