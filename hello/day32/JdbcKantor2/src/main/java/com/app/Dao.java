package com.app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/file", "root", "11111111");
    }

    public void create(Person person) {

        Connection connection = null;
        try {
            connection = getConnection();
            Statement st = connection.createStatement();
            String sql = String.format("insert into person (name, age) Values ('%s', %s)", person.getName(), person.getAge());
            st.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public List<Person> read() {
        try (Connection c = getConnection()) {
            List<Person> list = new ArrayList<>();
            Statement st = c.createStatement();
            String sql = "SELECT from person";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person p = new Person();
                p.setName(name);
                p.setAge(age);
                list.add(p);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }

    public void update(String name, int age) {
        try (Connection c = getConnection()){
            Statement st = c.createStatement();
            String sql = String.format("UPDATE person set name = '%s' where age = %s",name,age);
            st.execute(sql);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String name, int age) {
        try (Connection c = getConnection()){
            Statement st = c.createStatement();
            String sql = String.format("DELETE from person where age = %s", age);
            st.execute(sql);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
