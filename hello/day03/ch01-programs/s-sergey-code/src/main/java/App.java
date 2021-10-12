public class App {
    public static void main(String[] args) {


        Car audi = new Car();

        audi.price = 60;
        audi.year = 2019;
        audi.name = "TT";

        /*System.out.println("price = " + audi.price);
        System.out.println("year = " + audi.year);
        System.out.println("name = " + audi.name);*/
        audi.printInfo();


        Car porshe = new Car();

        porshe.price = 120;
        porshe.year = 2000;
        porshe.name = "GT-3";

        //System.out.println("price = " + porshe.price);
        //System.out.println("year = " + porshe.year);
        //System.out.println("name = " + porshe.name);
        porshe.printInfo();
        System.out.println("---------------------------------------------------------------------------------------");
        audi.drive();
        porshe.drive();
        System.out.println("---------------------------------------------------------------------------------------");
        audi.printInfo();
        porshe.printInfo();






    }
}
