package dao;

import entities.Person;

import java.util.List;

public interface PersonDao {

    void insert(Person person);

    void insertAll(List<Person> personList);

    Person select(int id);

    List<Person> selectAll();

    void update(Person person);

    void updateAll(List<Person> personList);

    void delete(int id);
}