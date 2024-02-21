package ru.alan.crudapp1.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.alan.crudapp1.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Person person = new Person();

		person.setId(resultSet.getInt("id"));
		person.setName(resultSet.getString("name"));
		person.setEmail(resultSet.getString("email"));
		person.setAge(resultSet.getInt("age"));
		return person;
	}
}
