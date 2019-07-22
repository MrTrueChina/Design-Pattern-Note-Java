package org.mtc.pattern.proxy.textgetter;

/**
 * 	TextGetterDatabase 的代理类，负责在有缓存的时候从缓存取数据，没缓存的时候从数据取数据并存入缓存
 */
public class TextGetterProxy implements TextGetter {

	/**
	 * 	被代理类的对象，通过这个对象执行被代理类的方法
	 */
	private TextGetterDatabase _textGetterDatabase = new TextGetterDatabase();

	/**
	 * 	模拟缓存对象
	 */
	private TextCache _cache;

	public TextGetterProxy(TextCache cache) {
		_cache = cache; // 为了方便将模拟缓存对象通过构造方法存进来
	}

	@Override
	public String getText() {

		String text = _cache.getText();

		if (text != null)
			return text;

		return getTextFromDatabaseAndSetIntoCache();
	}

	private String getTextFromDatabaseAndSetIntoCache() {

		String text = _textGetterDatabase.getText();

		_cache.setText(text);

		return text;
	}
}
