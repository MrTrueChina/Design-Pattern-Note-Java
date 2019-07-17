package org.mtc.pattern.composite.ui;

/**
 * 	用于显示图片的UI
 */
public class Icon extends UIContainer {

	/**
	 * 	这个 Icon 显示的图片，简单起见用String代替
	 */
	private String _image;

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public Icon() {
	}

	public Icon(String image) {
		_image = image;
	}

	@Override
	protected void drawSelf() {

		// 绘制UI我还真写过，不过一个演示而已，搞个输出就算完了

		System.out.println("绘制 " + _image);
	}
}
