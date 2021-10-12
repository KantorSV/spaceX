public class Face {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 20;

        Note Note = new Note();
        int z = Note.one(a, b, c);
        System.out.println("a + b + c = " + z);

        Note Note1 = new Note();
        int x = Note.two(a, b, c);
        System.out.println("a + b - c = " + x);

        Note Note2 = new Note();
        int v = Note.three(a, b, c);
        System.out.println("a - b + c = " + v);

        Note Note3 = new Note();
        int n = Note.four(a, b, c);
        System.out.println("a * b / c = " + n);

        if (a == b) {
            System.out.println("NO");
        } else if (a < b){
            System.out.println("EEEEEEEEE");
        }

        switch (a){
            case 12:
                System.out.println("crazy");
                break;
            case 32:
                System.out.println("no no no");
                break;
            case 6:
                System.out.println("YES !!!!");
                break;
            default:
                System.out.println("FUCK");
        }
    }
}
