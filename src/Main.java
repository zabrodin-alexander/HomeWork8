import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");

        int[] a = new int[3];
        double[] b = {1.57, 7.654, 9.986};
        int[] c = {1, 2, 3, 4, 5};

        //task 2
        System.out.println("Task 2");
        //Первый массив
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }System.out.println();

        //Второй массив
        b[0] = 1.57;
        b[1] = 7.654;
        b[2] = 9.986;
        for (int i = 0; i < b.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(b[i]);
        }
        System.out.println();
        //Третий массив
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
            if (i < c.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 3
        System.out.println("Task 3");
        //Первый массив
        a[0] = 3;
        a[1] = 2;
        a[2] = 1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }System.out.println();

        //Второй массив
        b[0] = 9.986;
        b[1] = 7.654;
        b[2] = 1.57;
        for (int i = 0; i < b.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(b[i]);
        }
        System.out.println();

        //Третий массив
        for (int i = c.length - 1; i >= 0; i--) {
            System.out.print(c[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //task 4
        System.out.println("Task 4");

        int [] arr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if(arr [i] % 2 !=0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}