package org.mtc.pattern.composite;

import org.mtc.pattern.composite.ui.Icon;
import org.mtc.pattern.composite.ui.Label;
import org.mtc.pattern.composite.ui.UIContainer;

/*
 * 	组合模式（Composite）：在对象内部储存任意数量的对象，形成树形结构，可以通过一个对象操作它内部的所有对象，内部对象可以任意增减
 * 
 * 	这个模式可以有效应对有层级关系的情况，例如多级列表、多层UI、Git的分支管理，当然还有写到吐的商品分类
 * 
 * 	商品分类写到吐了，演示的例子用多层UI来写：
 * 	多层UI最大的困难就是UI之间的遮挡，高端的方案是先进行显示区域的判断，之后只绘制显示区域
 * 	我哪有那么大能耐，我用低端方案：从下向上逐层绘制，上层的覆盖掉下层的
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		UIContainer mainContainer = new UIContainer();
		UIContainer subContainer = new UIContainer();
		
		mainContainer.add(new Icon("主容器的图片.jpg"));
		mainContainer.add(new Label("主容器的描述文字"));
		
		mainContainer.add(subContainer);
		
		subContainer.add(new Icon("子容器的图片.jpg"));
		subContainer.add(new Label("子容器的描述文字"));
		
		mainContainer.draw();
	}
}
