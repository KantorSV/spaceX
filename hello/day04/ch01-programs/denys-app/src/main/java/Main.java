public class Main {

    public static void main(String[] args) {

        Helper.myIf();
        //Helper.myIf2();
        Helper a = new Helper();
        //a.myIf2();
        a.age=1;
        a.price=10;

        Helper b = new Helper();
        b.age=2;
        b.price=20;




        System.out.println("a.age="+a.age);
        System.out.println("b.age="+b.age);

        System.out.println("------static--------------------");

        System.out.println("a.price="+a.price);
        System.out.println("b.price="+b.price);

        a.price=50;
        System.out.println("-------------------------------------");
        System.out.println("a.price="+a.price);
        System.out.println("b.price="+b.price);

        Helper.price = 900;
        System.out.println("-------------------------------------");
        System.out.println("a.price="+a.price);
        System.out.println("b.price="+b.price);



    }





}
