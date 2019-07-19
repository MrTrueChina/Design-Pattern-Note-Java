package org.mtc.pattern.flyweight.test;

import org.mtc.pattern.flyweight.test.Drawer;
import org.mtc.pattern.flyweight.test.DrawerFactory;

/*
 * 	享元模式（Flyweight）：
 */
public class Main {
	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		Drawer roundDrawer = DrawerFactory.getRoundDrwaer();
		
		roundDrawer.draw();
	}
}
