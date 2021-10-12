package com.app;

public class BulkMain {

    public static void main(String[] args) {
        String filePath = "Bulk-Kantor.txt";
        BulkFileHelper bulkFileHelper = new BulkFileHelper();

        Person[] persons = new Person[1000000];

        for(int i=0;i<persons.length;i++){
            Person p = new Person();
            p.setName("Name"+i);
            p.setAge(i);
            persons[i] = p;
        }
        //bulkFileHelper.writeToFile(filePath, persons);

        Person[] result = bulkFileHelper.readFromFile(filePath);
        for(int i=0;i<result.length;i++){
            System.out.println("i="+result[i]);
        }
    }

}
