package org.mtc.pattern.filter.criteria;

import java.util.List;

import org.mtc.pattern.filter.person.Person;

/**
 * 	过滤器，符合标准的对象会被保存并返回
 */
public interface Filter {
	
	/**
	 * 	从指定的List中筛选出符合条件的元素
	 * @param persons
	 * @return
	 */
	public List<Person> meetCriteria(List<Person> persons);
}
