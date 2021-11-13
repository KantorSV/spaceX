package org.example;

import com.calc.MyCalculator;
import com.calc.MyCalculatorImpl;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

public class ResultListener implements EventHandler {
    private TextField textField;


    @Override
    public void handle(Event event) {
        MyCalculator myCalculator = new MyCalculatorImpl();
        String text = textField.getText();
        System.out.println("text=" + text);
        if (text.contains("+")) {
            int i = text.indexOf("+");
            System.out.println("i=" + i);
            String aText = text.substring(0, i);
            String bText = text.substring(i + 1, text.length());
            System.out.println("aText=" + aText);
            System.out.println("bText=" + bText);

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.add(a, b);
            textField.setText(text + "=" + res);


        } else if (text.contains("-")) {
            int i = text.indexOf("-");
            System.out.println("i=" + i);
            String aText = text.substring(0,i);
            String bText = text.substring(i+1,text.length());
            System.out.println("aText=" + aText);
            System.out.println("bText=" + bText);

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.subtract(a,b);
            textField.setText(text + "=" + res);

        } else if (text.contains("*")) {
            int i = text.indexOf("*");
            System.out.println("i=" + i);
            String aText = text.substring(0,i);
            String bText = text.substring(i+1,text.length());
            System.out.println("aText=" + aText);
            System.out.println("bText=" + bText);

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.product(a,b);
            textField.setText(text + "=" + res);
        } else {
            int i = text.indexOf("/");
            System.out.println("i=" + i);
            String aText = text.substring(0,i);
            String bText = text.substring(i+1,text.length());
            System.out.println("aText=" + aText);
            System.out.println("bText=" + bText);

            double a = Double.parseDouble(aText);
            double b = Double.parseDouble(bText);
            double res = myCalculator.divide(a,b);
            textField.setText(text + "=" + res);

        }

    }

    public void setTextField(TextField textField) {
        this.textField = textField;
    }
}
