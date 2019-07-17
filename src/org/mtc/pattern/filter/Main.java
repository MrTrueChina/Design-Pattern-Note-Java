package org.mtc.pattern.filter;

import java.util.ArrayList;
import java.util.List;

import org.mtc.pattern.filter.criteria.AgeFilter;
import org.mtc.pattern.filter.criteria.Filter;
import org.mtc.pattern.filter.criteria.NameContainFilter;
import org.mtc.pattern.filter.criteria.SexIsFilter;
import org.mtc.pattern.filter.criteria.type.EqualType;
import org.mtc.pattern.filter.person.Person;
import org.mtc.pattern.filter.person.Sex;

/*
 * 	过滤器模式（Filter）又名标准模式（Criteria）：使用类定义各种标准，使用过滤器筛选出符合标准的对象，可以一次筛选多种标准
 * 
 * 	这个模式用于根据各种规则筛选对象，通过定义各种规则的筛选器来进行筛选
 * 	这个模式在多种语言中都被封装到了工具类里（最常见的是集合的工具类），一般来说手写的时候并不多
 * 	一般来说这个模式应用于筛选逻辑复杂和筛选逻辑可能变动的情况
 */
public class Main {

	private final static List<Person> _persons = new ArrayList<Person>();
	static {
		_persons.add(new Person(12, 130, "小明", Sex.MALE));
		_persons.add(new Person(12, 120, "小红", Sex.FEMALE));
		_persons.add(new Person(12, 140, "小刚", Sex.MALE));
		_persons.add(new Person(18, 180, "李华", Sex.MALE));
		_persons.add(new Person(18, 175, "Sara", Sex.MALE));
		_persons.add(new Person(42, 186, "李雷", Sex.MALE));
		_persons.add(new Person(41, 173, "韩梅梅", Sex.FEMALE));
	}

	public static void main(String[] args) {
		demo();
	}

	private static void demo() {

		Filter isMale = new SexIsFilter(Sex.MALE); // 筛选男人的过滤器
		Filter isFemale = new SexIsFilter(Sex.FEMALE); // 筛选女人的过滤器
		Filter isNameContaionXiao = new NameContainFilter("小"); // 筛选名字里有"小"的人的过滤器
		Filter isAdult = new AgeFilter(EqualType.GREAT_OR_EQUALS, 18); // 筛选大于等于18岁的人的过滤器

		List<Person> men = isMale.meetCriteria(_persons);
		List<Person> women = isFemale.meetCriteria(_persons);
		List<Person> xiao = isNameContaionXiao.meetCriteria(_persons);
		List<Person> adults = isAdult.meetCriteria(_persons);

		System.out.println("男人：" + men);
		System.out.println("女人：" + women);
		System.out.println("名字里有\"小\"的人：" + xiao);
		System.out.println("成年人：" + adults);
	}
}
