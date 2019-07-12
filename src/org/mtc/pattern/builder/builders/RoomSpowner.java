package org.mtc.pattern.builder.builders;

import org.mtc.pattern.builder.Map;

/**
 * 	房间生成器，建造者之一，负责在地图上生成房间
 */
public class RoomSpowner {

	/**
	 * 在地图上生成房间，部分参数和实际代码省略
	 * 
	 * @param map
	 */
	public static Map spownRooms(Map map) {

		System.out.println("向地图 " + map + " 中添加房间");
		
		return map;
	}

	/*
	 * 	生成房间的代码包括：
	 * 
	 * 	一个初始化生成器环境的方法及其子方法
	 * 
	 * 	一个随机生成房间的方法及其子方法
	 * 
	 * 	一个判断房间覆盖关系的方法及其子方法
	 * 
	 * 	一个清理生成器环境的方法及其子方法
	 * 
	 * 	共计约10个方法
	 */
}
