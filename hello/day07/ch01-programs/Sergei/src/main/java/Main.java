public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("plus one " + i);
            i++;
        }
        System.out.println("-------------------");
        int n = 10;
        helper.xxx(n);
        System.out.println("-------------------");
        int m = 10;
        helper.zzz(m);
        System.out.println("-------------------");
        for (int a = 10; a <= 100; a = a + 20) {
            System.out.println("op pa pa " + a);
        }
        System.out.println("-------------------");

        int[] array = {5,6,45,23,21,18,65};
        int x = array.length;
        for (i=0;i<x;i++){
            System.out.println("array ["+ i +"]="+array [i]);
        }
        System.out.println("--------------------------");
        for (i=x-1;i>=0;i--){
            System.out.println("array ["+ i +"]="+array [i]);
        }

        helper.zzz(m);


    }

}
