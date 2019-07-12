package org.mtc.pattern.builder.builders;

import org.mtc.pattern.builder.Map;

/**
 * 	地图生成器，所有建造者的控制器
 */
public class MapSpowner {

	/**
	 * 生成地图的方法，部分参数和代码省略
	 * 
	 * @return
	 */
	public static Map spownMap() {

		Map map = new Map();

		map = RoomSpowner.spownRooms(map); // 必须最先执行，约10个方法
		map = MazeSpowner.fillMaze(map); // 必须在房间生成后执行，约20个方法
		map = Connector.connect(map); // 必须在迷宫填充后执行，约40个方法
		map = Uncarver.uncarve(map); // 必须在连接后执行，约10个方法

		return map;
		
		/*
		 * 	像这种一个对象的创建过于复杂以至于封装到一个工厂类里极为混乱的情况，可以使用建造者模式将各个步骤独立出去，大大提升代码可读性
		 * 
		 * 	如果在外部看，对象就是由控制器类生产出来的，所以如果将建造者模式看做一个整体，会发现这其实就是工厂模式
		 * 	而如果在内部看，每个建造者都像是一个加工厂，也就是说内部也和工厂模式十分相似
		 * 
		 * 	除了拆解复杂的操作，建造者模式还可以将各个步骤的变化隔离开来，这样当修改一个步骤时不需要修改其他的步骤，降低了修改成本，提高了稳定性
		 */
	}
}
