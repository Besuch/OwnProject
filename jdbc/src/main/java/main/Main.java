package main;

import dao.BookDao;
import dao.PersonDao;
import dao.impl.BookDaoImpl;
import dao.impl.PersonDaoImpl;
import entities.Book;
import entities.Person;

public class Main {

    public static void main(String[] args) {
        PersonDao personDao = new PersonDaoImpl();
        Person person1 = new Person(1, "Denis", "Homilka");
        personDao.insert(person1);

        BookDao bookDao = new BookDaoImpl();
        Book book1 = new Book(101, "Head First SQL", "Lynn Beighley");
        bookDao.insert(book1);

    }
}