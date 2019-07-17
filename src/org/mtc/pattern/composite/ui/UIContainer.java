package org.mtc.pattern.composite.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 	UI容器，同时是所有UI的父类<br/>
 * 	实现 Iterable 接口支持迭代
 */
public class UIContainer implements Iterable<UIContainer> {

	/**
	 * 	所有直属子级UI的列表，在列表中越靠后的在显示时越靠上（越晚绘制）<br/>
	 * 	protected 的，不对外公开，防止直接修改。但这样无法迭代，所以要实现 Iterable 接口
	 */
	protected List<UIContainer> _chindren = new ArrayList<UIContainer>();

	/**
	 * 	绘制UI
	 */
	public final void draw() {
		//绘制UI必须先绘制自身之后绘制子级，任何子类不能更改，定为 final
		drawSelf();
		drawChildren();
	}

	protected void drawSelf() {
		//空方法，用来给子类覆写的
	}

	private void drawChildren() {
		for (UIContainer child : _chindren)
			child.draw();
	}

	/**
	 * 	添加子级UI
	 * 
	 * @param container
	 */
	public void add(UIContainer container) {
		_chindren.add(container);
	}

	/**
	 * 	移除指定下标的UI
	 * 
	 * @param index
	 */
	public void remove(int index) {
		_chindren.remove(index);
	}

	/**
	 * 	移除指定UI
	 * 
	 * @param container
	 */
	public void remove(UIContainer container) {
		_chindren.remove(container);
	}

	@Override
	public Iterator<UIContainer> iterator() {
		return _chindren.iterator(); // Iterable 接口的 iterator 方法并不难实现，只要能返回一个 Iterable 就行
	}
}
