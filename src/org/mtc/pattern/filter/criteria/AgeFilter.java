package org.mtc.pattern.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import org.mtc.pattern.filter.criteria.type.EqualType;
import org.mtc.pattern.filter.person.Person;

/**
 * 	年龄过滤器，符合年龄和模式的对象认为通过
 */
public class AgeFilter implements Filter {

	private EqualType _type;
	private int _age;

	public AgeFilter(EqualType type, int age) {
		_type = type;
		_age = age;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {

		List<Person> meetPersons = new ArrayList<Person>();

		for (Person person : persons)
			if (isMeet(person))
				meetPersons.add(person);

		return meetPersons;
	}

	private boolean isMeet(Person person) {
		
		switch (_type) {

		case EQUALS:
			return person.getAge() == _age;

		case NOT_EQUALS:
			return person.getAge() != _age;

		case GREAT_THAN:
			return person.getAge() > _age;

		case GREAT_OR_EQUALS:
			return person.getAge() >= _age;

		case LESS_THAN:
			return person.getAge() < _age;

		case LESS_OR_EQUALS:
			return person.getAge() <= _age;

		default:
			throw new IllegalArgumentException("Unexpected value: " + _type);
		}
	}
}
