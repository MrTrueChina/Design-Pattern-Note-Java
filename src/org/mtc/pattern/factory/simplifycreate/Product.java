package org.mtc.pattern.factory.simplifycreate;

/**
 * 一个创建对象后需要很多工序才能使用的类
 */
public class Product {
	/*
	 * 	定义一大堆的属性，我们假设这个类的对象必须要设置完这些属性并执行一个启动方法后才能使用
	 */
	private String url;
	private int port;
	private String ip;
	private int size;

	public void setUrl(String url) {
		this.url = url;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * 启动方法，必须运行这个方法才能使用这个类的对象
	 */
	public void start() {
		System.out.println("启动，本对象可以开始使用");
	}
	
	/**
	 * 工作方法，这个类的真正用途
	 */
	public void work() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Product [url=" + url + ", port=" + port + ", ip=" + ip + ", size=" + size + "]";
	}
}
