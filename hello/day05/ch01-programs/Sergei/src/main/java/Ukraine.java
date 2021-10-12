public class Ukraine {
    public static void main(String[] args) {
        int parameter = 10;
        switchMethod( parameter);
    }

        public static void switchMethod(int parameter) {
        switch (parameter) {
            case 10:
                System.out.println("zero");
                break;
            case 11:
                System.out.println("five");
                break;
            case 12:
                System.out.println("ten");
                break;
            case 15:
                System.out.println("fiveteenth");
                break;
            default:
                System.out.println("default");
        }

            System.out.println("-----------------------finish-------------------------");
    }

}
