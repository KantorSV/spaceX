package meta;

import java.util.List;
import java.util.Map;

public class MainMeta {
    public static void main(String[] args) {

        Dao3 dao = new Dao3();

        List<Map<String , Object>> res = dao.readAll("person");
        for (int i = 0; i < res.size(); i++)
            System.out.println(res.get(i));


    }
}
