package trash;

import java.util.ArrayList;
import java.util.List;

public class DataModule {
    private List<String> list = new ArrayList<>();

    public void add(String data){
        list.add(data);
    }

    public List<String> getList() {
        return list;
    }
}
