package org.mtc.pattern.proxy.textgetter;

/**
 * 	从数据库取文本的接口，使用接口和工厂隐藏实现细节
 */
public interface TextGetter {

	public String getText();
}
