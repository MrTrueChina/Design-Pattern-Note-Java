package org.mtc.pattern.bridge.shusheng007;

public class Main {
	public static void main(String[] args) {
		// 点两杯加奶的大杯咖啡
		RefinedCoffee largeWithMilk = new LargeCoffee(new Milk());
		largeWithMilk.orderCoffee(2);
		largeWithMilk.checkQuality();
	}
}
