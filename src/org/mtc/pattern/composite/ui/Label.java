package org.mtc.pattern.composite.ui;

/**
 * 	用于显示文字的UI
 */
public class Label extends UIContainer {

	/**
	* 这个 Label 显示的文字
	*/
	private String _text;

	public void setText(String text) {
		_text = text;
	}

	public String getText() {
		return _text;
	}

	public Label() {
	}

	public Label(String text) {
		_text = text;
	}

	@Override
	protected void drawSelf() {

		// 绘制UI我还真写过，不过一个演示而已，搞个输出就算完了

		System.out.println("绘制文字：" + _text);
	}
}
