package pl.com.bottega.documentmanagement.homework;

import java.util.Random;

/**
 * Created by bernard.boguszewski on 30.06.2016.
 */
public class MyClass {
    private int[][] array = new int[10][10];

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setArray();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(myClass.array[i][j] + " ");
            }
            System.out.println();
        }

    }

    private void setArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }
}
