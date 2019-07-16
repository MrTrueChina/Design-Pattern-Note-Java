package org.mtc.pattern.bridge.shusheng007;

public class LargeCoffee extends RefinedCoffee {

	public LargeCoffee(ICoffeeAdditives additives) {
		super(additives);
	}

	@Override
	public void orderCoffee(int count) {

		additives.addSomething();

		System.out.println("大杯咖啡" + count + "杯");
	}
}
