package dao.impl;

import dao.PersonDao;
import entities.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import main.DBConnector;

public class PersonDaoImpl implements PersonDao {

    @Override
    public void insert(Person person) {
        String sql = "INSERT INTO persons (id, name, surName) VALUES (?, ?, ?)";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, person.getId());
            ps.setString(2, person.getName());
            ps.setString(3, person.getSurName());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertAll(List<Person> personList) {
        for (Person person : personList) {
            insert(person);
        }
    }

    @Override
    public Person select(int id) {
        Person person = new Person();
        String sql = "SELECT * FROM persons WHERE id = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            try (ResultSet resultSet = ps.executeQuery()) {
                while (resultSet.next()) {
                    person.setId(resultSet.getInt("id"));
                    person.setName(resultSet.getString("name"));
                    person.setSurName(resultSet.getString("surName"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return person;
    }

    @Override
    public List<Person> selectAll() {
        List<Person> personList = new ArrayList<>();
        String sql = "SELECT * FROM persons";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            try (ResultSet resultSet = ps.executeQuery(sql)) {
                while (resultSet.next()) {
                    Person person = new Person();
                    person.setId(resultSet.getInt("id"));
                    person.setName(resultSet.getString("name"));
                    person.setSurName(resultSet.getString("surName"));
                    personList.add(person);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return personList;
    }

    @Override
    public void update(Person person) {
        String sql = "UPDATE persons SET name = ?, surName = ? WHERE id = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, person.getName());
            ps.setString(2, person.getSurName());
            ps.setInt(3, person.getId());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateAll(List<Person> personList) {
        for (Person person : personList) {
            update(person);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM persons WHERE id = ?";

        try (Connection connection = DBConnector.getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}