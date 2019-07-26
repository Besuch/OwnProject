package dao;

import entities.Book;

import java.util.List;

public interface BookDao {

    void insert(Book book);

    void insertAll(List<Book> bookList);

    Book select(int number);

    List<Book> selectAll();

    void update(Book book);

    void updateAll(List<Book> bookList);

    void delete(int number);
}