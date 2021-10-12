package org.app02;

public class Main02 {

    public static void main(String[] args) {

        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int target = 17;
        int index = binarySearch(data, target);
        System.out.println("index = " + index);

    }

    public static int binarySearch(int[] data, int target) {

        int left = 0;
        int right = data.length -1;
        while (left <= right) {
            int middleIndex = (left + right) / 2;
            if (data[middleIndex] == target) {
                return middleIndex;
            }
            if (target < data[middleIndex]) {
                right = middleIndex - 1;
            } else {
                left = middleIndex + 1;
            }
        }
        return -1;
    }
}
