package org.mtc.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import org.mtc.pattern.filter.person.Person;

/**
 * 	检测名字的过滤器，含有指定字符则认为通过
 */
public class NameContainFilter implements Filter {

	private String _key;

	public NameContainFilter(String key) {
		_key = key;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		
		List<Person> meetPersons = new ArrayList<Person>();
		
		for (Person person : persons)
			if (person.getName().contains(_key))
				meetPersons.add(person);

		return meetPersons;
	}
}
