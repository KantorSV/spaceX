package com.app;

import java.io.*;

public class FileHelper {

    public void writeToFile(String filePath, String data) {
        File file = new File(filePath);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(String filePath) {
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String result = "";
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                } else {
                    result = result + "\n" + line;
                }
            }
            return result;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
