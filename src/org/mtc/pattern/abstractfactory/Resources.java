package org.mtc.pattern.abstractfactory;

public class Resources {
	/**
	 * 当前的UI主题
	 */
	private static UIStyle uiStyle = UIStyle.RED;

	/**
	 * 设置UI主题
	 * 
	 * @param uiStyle
	 */
	public static void setUiStyle(UIStyle uiStyle) {
		Resources.uiStyle = uiStyle;
		System.out.println("UI主题设置为 " + Resources.uiStyle);
	}

	/**
	 * 获取UI主题
	 * 
	 * @return
	 */
	public static UIStyle getUiStyle() {
		return uiStyle;
	}
}
