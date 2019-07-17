package org.mtc.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import org.mtc.pattern.filter.person.Person;
import org.mtc.pattern.filter.person.Sex;

/**
 * 	性别过滤器，性别为传入的性别则认为通过
 */
public class SexIsFilter implements Filter {

	private Sex _sex;

	public SexIsFilter(Sex target) {
		_sex = target;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> meetPersons = new ArrayList<Person>();

		for (Person person : persons)
			if (person.getSex() == _sex)
				meetPersons.add(person);

		return meetPersons;
	}
}
