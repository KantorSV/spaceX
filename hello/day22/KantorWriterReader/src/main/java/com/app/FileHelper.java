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
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String result = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                } else {
                    result = result + "\n" + line;
                }
            }
            return result;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
