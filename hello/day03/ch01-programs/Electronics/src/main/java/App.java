public class App {
    public static void main(String[] args) {

        nVideo videoCard = new nVideo();

        videoCard.name = "GeForse RTX";
        videoCard.series = 3080;
        videoCard.price = 1280;

        System.out.println("name = " + videoCard.name);
        System.out.println("series = " + videoCard.series);
        System.out.println("price = " + videoCard.price);

        System.out.println("-----------------------------------------------------------------------------------------");

        nVideo processor = new nVideo();

        processor.name = "Intel I-9";
        processor.series = 9900;
        processor.price = 600;

        System.out.println("name = " + processor.name);
        System.out.println("series = " + processor.series);
        System.out.println("price = " + processor.price);

        System.out.println("-----------------------------------------------------------------------------------------");

        videoCard.printInfo();
        System.out.println("**********");
        processor.printInfo();


    }
}
