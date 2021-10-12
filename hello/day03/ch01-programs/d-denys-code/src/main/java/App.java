public class App {

    public static void main(String[] args) {
        System.out.println("App");
        //instance
        Phone t1 = new Phone();
        t1.powerOn();
        t1.sendSms();
        t1.call();
        t1.powerOff();

        Phone t2 = new Phone();
        t2.powerOff();
        t2.sendSms();
        t2.powerOn();

        System.out.println("---------------------Car------------------------------");

        Car car = new Car();
        System.out.println("car.year=" + car.year);
        System.out.println("car.price=" + car.price);
        System.out.println("car.manufacture=" + car.manufacture);
        System.out.println("###Set new values###");
        car.manufacture = "BMW";
        car.year = 2016;
        car.price = 30;
        System.out.println("car.year=" + car.year);
        System.out.println("car.price=" + car.price);
        System.out.println("car.manufacture=" + car.manufacture);

        System.out.println("-----------------car2----------------------------------------------------");
        Car car2 = new Car();
        System.out.println("car2.year=" + car2.year);
        System.out.println("car2.price=" + car2.price);
        System.out.println("car2.manufacture=" + car2.manufacture);
        car2.manufacture = "mercedes";
        car2.year = 2021;
        car2.price = 40;
        System.out.println("car2.year=" + car2.year);
        System.out.println("car2.price=" + car2.price);
        System.out.println("car2.manufacture=" + car2.manufacture);
        System.out.println("---------------------Student------------------------------");

        Student x = new Student();
        x.speak();
        x.name = "Denis";
        x.age = 10;
        x.speak();


        Student y = new Student();
        y.speak();
        y.name = "Sergey";
        y.age = 10;
        y.speak();

        System.out.println("------------------------------maakeAction1()-----------------------------------------------");
        ActionSample actionSample = new ActionSample();
        actionSample.makeAction();
        System.out.println("------------------------------maakeAction2()-----------------------------------------------");
        actionSample.makeAction2();
        System.out.println("------------------------------maakeAction3()-----------------------------------------------");
        actionSample.makeAction3();
        System.out.println("------------------------------maakeAction4()-----------------------------------------------");
        actionSample.makeAction4();
        System.out.println("------------------------------maakeAction5()-----------------------------------------------");
        actionSample.makeAction5(0);


    }


}

