package meta;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dao3 {

    public List<Map<String, Object>> readAll(String tableName){
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT * from "+tableName);
            ResultSet rs = ps.executeQuery();

            ResultSetMetaData meta = rs.getMetaData();
            int columnCount = meta.getColumnCount();
            // System.out.println("columnCount="+columnCount);

            List<String> columns = new ArrayList<>();
            for(int i=0;i<columnCount;i++){
                String columnName = meta.getColumnName(i+1);
                //   System.out.println((i+1)+"="+columnName);
                columns.add(columnName);
            }

            //System.out.println(columns);

            List<Map<String, Object>> result = new ArrayList<>();
            while(rs.next()){
                Map<String, Object> dataMap = new HashMap();
                for(int i=0;i<columns.size();i++){
                    String columnName = columns.get(i);
                    Object columnValue = rs.getObject(columnName);
                    dataMap.put(columnName, columnValue);
                }
                //  System.out.println(dataMap);
                result.add(dataMap);
            }

            return result;

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/file", "root", "11111111");
    }
}
