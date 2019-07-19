package org.mtc.pattern.flyweight.test;

import java.util.HashMap;
import java.util.Map;

public class DrawerFactory {

	private static Map<Class<? extends Drawer>, Drawer> _drawerMap = new HashMap<Class<? extends Drawer>, Drawer>();

	public static Drawer getRoundDrwaer(int x, int y, int radius) {

		if (_drawerMap.containsKey(RoundDrawer.class))
			return _drawerMap.get(RoundDrawer.class);

		System.out.println("创建画圆对象");

		_drawerMap.put(RoundDrawer.class, new RoundDrawer(x, y, radius));
		return _drawerMap.get(RoundDrawer.class);
	}
}
