package org.mtc.pattern.proxy.textgetter;

/**
 * `TextGetter的工厂类，使用工厂配合接口来隐藏实现细节
 */
public class TextGetterFactory {

	public static TextGetter getTextGetter(TextCache cache) {
		return new TextGetterProxy(cache);
	}
}
