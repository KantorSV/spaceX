package org.app01;

public class Main01 {

    public static void main(String[] args) {

        int[] data = {2, 5, 4, 3, 9, 0, 74, 6, 33, 54, 2, 65, 785, 54, 66};
        int target = 65;
        int index = findIndex(data, target);
        System.out.println("index = " + index);
    }

    private static int findIndex(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
