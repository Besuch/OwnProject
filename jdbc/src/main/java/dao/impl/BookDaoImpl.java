package dao.impl;

import dao.BookDao;
import entities.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.DBConnector;

public class BookDaoImpl implements BookDao {

    @Override
    public void insert(Book book) {
        String sql = "INSERT INTO books (number, title, author) VALUES (?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, book.getNumber());
            ps.setString(2, book.getTitle());
            ps.setString(3, book.getAuthor());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertAll(List<Book> bookList) {
        for (Book book : bookList) {
            insert(book);
        }
    }

    @Override
    public Book select(int number) {
        Book book = new Book();
        String sql = "SELECT * FROM books WHERE number = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, number);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    book.setTitle(resultSet.getString("title"));
                    book.setAuthor(resultSet.getString("author"));
                    book.setNumber(resultSet.getInt("number"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return book;
    }

    @Override
    public List<Book> selectAll() {
        List<Book> bookList = new ArrayList<>();
        String sql = "SELECT * FROM books";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = ps.executeQuery(sql)) {
                while (resultSet.next()) {
                    Book book = new Book();
                    book.setNumber(resultSet.getInt("number"));
                    book.setTitle(resultSet.getString("title"));
                    book.setAuthor(resultSet.getString("author"));
                    bookList.add(book);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return bookList;
    }

    @Override
    public void update(Book book) {
        String sql = "UPDATE books SET title = ?, author = ? WHERE number = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setInt(3, book.getNumber());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateAll(List<Book> bookList) {
        for (Book book : bookList) {
            update(book);
        }
    }

    @Override
    public void delete(int number) {
        String sql = "DELETE FROM books WHERE number = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, number);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}