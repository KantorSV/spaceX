package com.app;


import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//CRUD
public class Dao {

    /*static{
        try {
            DriverManager.registerDriver(new Driver());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }*/

    /*static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }*/


    public void create(Person person) {
        Connection connection = null;
        try {
            connection = getConnection();

            Statement statement = connection.createStatement();
            String sql = String.format("insert into person (name, age) Values ('%s', %s)", person.getName(), person.getAge());
            System.out.println("sql=" + sql);
            statement.execute(sql);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }


    public List<Person> read() {
        try (Connection c = getConnection()) {
            List<Person> list = new ArrayList<>();
            Statement statement = c.createStatement();
            String sql = "SELECT * FROM person";
            System.out.println(sql);
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                Person p = new Person();
                p.setAge(age);
                p.setName(name);
                list.add(p);
            }
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public void update(int age, String name) {
        try (Connection c = getConnection()) {
            Statement statement = c.createStatement();
            String sql = String.format("update person set name='%s' where age=%s", name, age);
            System.out.println(sql);
            statement.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void delete(String name, int age) {
        try (Connection c = getConnection()) {
            Statement statement = c.createStatement();
            String sql = String.format("DELETE from person where name='%s'", name);
            System.out.println(sql);
            statement.execute(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/file", "root", "11111111");
    }
}
