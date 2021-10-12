package app.com;

public class Main {
    public static void main(String[] args) {
        String filePath = "KantorData.txt";
        FileHelper fileHelper = new FileHelper();
        Person person = new Person();
        person.setAge(34);
        person.setName("Serhii");

        fileHelper.writeToFile(filePath, person);
        Person result = fileHelper.readFromFile(filePath);

        System.out.println(result);



    }
}
