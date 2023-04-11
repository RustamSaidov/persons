package ru.job4j.Service;

import ru.job4j.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);

    boolean deleteById(int id);

    boolean update(Person person);

    Optional<Person> findById(int id);

    List<Person> findAll();
}
