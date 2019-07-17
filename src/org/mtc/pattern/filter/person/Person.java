package org.mtc.pattern.filter.person;

/**
 * 	被筛选的类
 */
public class Person {

	private int _age;
	private String _name;
	private Sex _sex;

	public Person(int age, float height, String name, Sex sex) {
		_age = age;
		_name = name;
		_sex = sex;
	}

	public int getAge() {
		return _age;
	}

	public String getName() {
		return _name;
	}

	public Sex getSex() {
		return _sex;
	}

	@Override
	public String toString() {
		return "[ " + _name + "，" + _age + "岁，" + ((_sex == Sex.MALE) ? "男" : "女") + " ]";
	}
}
