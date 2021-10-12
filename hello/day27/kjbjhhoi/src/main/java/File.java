import java.io.FileWriter;
import java.io.IOException;

public class File {

    public File() {
    }

    public void writeFile(String filePath, String data) {

        File file = new File();
        try (FileWriter writer = new FileWriter(String.valueOf(file))) {
            writer.write(data);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
