package app.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class F1 {
    public void writeToFile(String filePath, String data) {

        File file = new File(filePath);
        try (FileOutputStream out = new FileOutputStream(file)){
            byte[] dataB = data.getBytes();
            out.write(dataB);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFromFile(String filePath){
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
