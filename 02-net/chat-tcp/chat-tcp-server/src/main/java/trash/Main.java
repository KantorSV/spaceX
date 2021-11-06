package trash;

public class Main {

    public static void main(String[] args) {
        DataModule dataModuleA = new DataModule();
        dataModuleA.add("A");
        dataModuleA.add("B");


        DataModule dataModuleB = new DataModule();
        dataModuleB.add("C");

        System.out.println("a="+dataModuleA.getList());
        System.out.println("b="+dataModuleB.getList());

        System.out.println("a.hashCode="+dataModuleA.hashCode());
        System.out.println("b.hashCode="+dataModuleB.hashCode());
    }

}
