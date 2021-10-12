package com.app;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


//  byte[] byteData = data.getBytes();
// String str = new String(byteData);
public class FileHelper {

    public void writeToFile(String filePath, String data) {
        try {
            File file = new File(filePath);
            //System.out.println(file);
            //boolean exists = file.exists();
            //System.out.println("exists="+exists);
            FileOutputStream outputStream = new FileOutputStream(file);
            byte[] byteData = data.getBytes();
            System.out.println("string.data="+data);
            System.out.println("byteData="+Arrays.toString(byteData));
            String str = new String(byteData);
            System.out.println("str="+str);

            System.out.println("-----------write to file-------");

            outputStream.write(byteData);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
