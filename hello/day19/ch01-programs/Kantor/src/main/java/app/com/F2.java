package app.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class F2 {
    public void readFromFile(String filePath) {
        File file = new File(filePath);
        try (FileInputStream in = new FileInputStream(file)){
            int n = in.available();
            byte[] dataB = new byte[n];
            in.read(dataB);
            String d = new String(dataB);
            System.out.println(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
