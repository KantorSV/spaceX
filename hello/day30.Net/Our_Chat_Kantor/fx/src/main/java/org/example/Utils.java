package org.example;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class Utils {
    public static String userName;
    public static Socket socket;
    public static TextArea textArea;


    public static void showError(Exception ex) {
        try {
            //OutputStream out = new FileOutputStream(new File("error.txt"));
            ByteArrayOutputStream buf = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(buf);
            ex.printStackTrace(ps);
            byte[] errorsBytes = buf.toByteArray();
            String errorText = new String(errorsBytes);
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Exception");
            //alert.setHeaderText("Look, an Information Dialog");
            //alert.setContentText(errorText);
            TextArea errorArea = new TextArea();
            errorArea.setText(errorText);
            alert.getDialogPane().setExpandableContent(errorArea);
            alert.showAndWait();
        } catch (Exception ex1) {
            throw new RuntimeException(ex1);
        }
    }

}
