package org.mtc.pattern.builder.builders;

import org.mtc.pattern.builder.Map;

/**
 * 	连接器，建造者之一，用来连接地图中的各个区域
 */
public class Connector {

	/**
	 * 连接地图上各个区域的方法，部分参数和实际代码省略
	 * 
	 * @param map
	 */
	public static Map connect(Map map) {

		System.out.println("连接地图 " + map + " 中的区域");
		
		return map;
	}

	/*
	 * 	连接地图的代码包括：
	 * 
	 * 	一个初始化生成器环境的方法及其子方法
	 * 
	 * 	一个生成连接点的方法及其子方法
	 * 
	 * 	一个连接连接点的方法及其子方法
	 * 
	 * 	一个清除连接点的方法及其子方法
	 * 
	 * 	一个清理生成器环境的方法及其子方法
	 * 
	 * 	共计约40个方法
	 */
}
