package com.app;

import java.io.*;

public class FileHelper4 {

    public void writeToFile(String filePath, String data) {
        File file = new File(filePath);
        try (FileOutputStream out = new FileOutputStream(file)) {
            byte[] dataB = data.getBytes();
            out.write(dataB);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void readFromFile(String filePath) {
        File file = new File(filePath);
        try (FileInputStream in = new FileInputStream(file)) {
            int n = in.available();
            byte[] data = new byte[n];
            in.read(data);
            String d = new String(data);
            System.out.println(d);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /*

    public void q(){
        File file = new File("D://test.txt");
        try(FileOutputStream out = new FileOutputStream(file)){

        }catch(Exception ex){
            ex.printStackTrace()
        }
    }

    public void w(){
        File file = new File("D://test2.txt);
        try(FileInputStream in = new FileInputStream(file)){

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

     */
}
