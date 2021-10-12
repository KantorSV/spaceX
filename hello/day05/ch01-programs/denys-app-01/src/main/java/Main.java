public class Main {

    public static void main(String[] args) {
        int parameter = 0;
        ifElsemethod(parameter);
        ifElsemethod();

        switchMethod(parameter);

    }


    public static void ifElsemethod() {
        System.out.println("ifElsemethod()");
    }

    public static void ifElsemethod(int parameter) {
        System.out.println("parameter=" + parameter);
        boolean a = true;
        if (a) {
            System.out.println("inside if true");
        } else {
            System.out.println("inside if else");
        }
        System.out.println("------------------------");
        if (parameter > 0) {
            System.out.println(" is positive");
        } else {
            System.out.println("is negative");
        }

        if (parameter > 0) {
            System.out.println(" is positive");
        } else if (parameter == 0) {
            System.out.println("is zero");
        } else {
            System.out.println("is negative");
        }

        System.out.println("-----finish------");
    }

    public static void switchMethod(int parameter) {
        //System.out.println("--------switch start------");
        switch (parameter) {
            case 0:
                System.out.println("is zero");
                break;
            case 10:
                System.out.println("is ten");
                break;
            case -20:
                System.out.println("is - twenty");
                break;
            default:
                System.out.println("this default");
        }
        //System.out.println("--------switch end------");
    }


}
