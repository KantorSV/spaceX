package com.app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao2 {

    private Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/file", "root", "11111111");
    }

    public void create(Person person) {

        try (Connection connection = getConnection()){
            PreparedStatement ps = connection.prepareStatement("insert inti person (name, age) Values (?, ?)");
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.execute();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Person> read() {

        try (Connection connection = getConnection()){
            List<Person> list = new ArrayList<>();
            PreparedStatement ps = connection.prepareStatement("select * from person");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person p = new Person();
                p.setName(name);
                p.setAge(age);
                list.add(p);
            }
            return list;
        }catch (Exception ex) {
            throw new RuntimeException();
        }
    }

    public void update(String name, int age) {

        try (Connection connection = getConnection()){
            PreparedStatement ps = connection.prepareStatement("update person set name = ? where age = ?");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.execute();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String name, int age) {

        try (Connection connection = getConnection()){
            PreparedStatement ps = connection.prepareStatement("delete from person where name = ? and age = ?");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.execute();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
