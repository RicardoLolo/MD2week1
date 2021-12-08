package Baitap;

import java.util.Scanner;

public class XoaPTkhoimang {
    public static void main(String[] args) {
//        int ship;
        int [] array;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập số lượng phần tử của mảng:");
//        ship = scanner.nextInt();
//        array = new int[ship];
        array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" nhập vào phần tử thứ " + (i+1) + ":");
            array[i] = scanner.nextInt();
        }
        for (int k : array){
            System.out.println(k + "\t");
        }
        System.out.println();
        System.out.println("phần tử muốn xoá");
        int deleteElement = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement){
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j +1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        for (int k : array) {
            System.out.println(k + "\t");
        }
    }
}
