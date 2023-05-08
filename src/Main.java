import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
        task2();
        System.out.println(" ");
        task3();
        System.out.println(" ");
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(three));
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < one.length; i++) {
            if (i == one.length - 1) {
                System.out.println(one[i]);
                break;
            }
            System.out.print(one[i] + ", ");
        }
        for (int i = 0; i < two.length; i++) {
            if (i == two.length - 1) {
                System.out.println(two[i]);
                break;
            }
            System.out.print(two[i] + ", ");
        }
        for (int i = 0; i < three.length; i++) {
            if (i == three.length - 1) {
                System.out.println(three[i]);
                break;
            }
            System.out.print(three[i] + ", ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        double[] two = {1.57, 7.654, 9.986};
        int[] three = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = one.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(one[i]);
                break;
            }
            System.out.print(one[i] + ", ");
        }
        for (int i = two.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(two[i]);
                break;
            }
            System.out.print(two[i] + ", ");
        }
        for (int i = three.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(three[i]);
                break;
            }
            System.out.print(three[i] + ", ");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i]++;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}