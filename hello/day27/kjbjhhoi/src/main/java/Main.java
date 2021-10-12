public class Main {

    public static void main(String[] args) {
        File file = new File();
        String filePath = "C:\\text.css";
        String data = ".radio-color{-fx-mark-highlight-color : orange}.";
        file.writeFile(filePath, data);

    }
}
