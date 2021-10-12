public class App {
    public static void main(String[] args) {

        Meat bazar = new Meat();

        bazar.name = "pig";
        bazar.part = "pork shoulder";
        bazar.weight = 5;
        bazar.price_kg = 150;
        bazar.total = 750;

        System.out.println("товар - " + bazar.name);
        System.out.println("частина - " + bazar.part);
        System.out.println("вага - " + bazar.weight);
        System.out.println("ціна за кг - " + bazar.price_kg);
        System.out.println("всього - " + bazar.weight * bazar.price_kg);

        System.out.println("-----------------------------------------------------------------------------------------");

        Meat shop = new Meat();

        shop.name = "куриця";
        shop.part = "стегно";
        shop.weight = 4;
        shop.price_kg = 55;
        shop.total = 220;

        System.out.println("товар - " + shop.name);
        System.out.println("частина - " + shop.part);
        System.out.println("вага - " + shop.weight);
        System.out.println("ціна за кг - " + shop.price_kg);
        System.out.println("всього - " + shop.price_kg * shop.weight);

        System.out.println("-----------------------------------------------------------------------------------------");

        bazar.center();
        System.out.println("*************");
        shop.center();




    }
}
