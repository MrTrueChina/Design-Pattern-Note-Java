package org.mtc.pattern.builder.builders;

import org.mtc.pattern.builder.Map;

/**
 * 	迷宫生成器，建造者之一，用于在已将生成房间的地图中填充迷宫
 */
public class MazeSpowner {

	/**
	 * 在地图上填充迷宫，部分参数和实际代码省略
	 * 
	 * @param map
	 */
	public static Map fillMaze(Map map) {

		System.out.println("向地图 " + map + " 中填充迷宫");
		
		return map;
	}

	/*
	 * 	填充迷宫的代码包括：
	 * 
	 * 	一个初始化生成器环境的代码及其子方法
	 * 
	 * 	一个寻找起点的方法及其子方法
	 * 
	 * 	一个确认迷宫是否可以延伸到指定位置的的方法及其子方法
	 * 
	 * 	一套完整的普利姆迷宫生成算法
	 * 
	 * 	一个清理生成器环境的代码及其子方法
	 * 
	 * 	共计约20个方法
	 */
}
