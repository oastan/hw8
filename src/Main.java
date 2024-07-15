import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("task 1");
        int[] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double[] two = {1.57, 7.654, 9.986};

        int[] three = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("task 2");


        for (int a = 0; a < one.length; a++) {
            if (a == one.length - 1) {
                System.out.println(one[a]);
                break;
            }
            System.out.print(one[a] + ", ");
        }


        for (int a = 0; a < two.length; a++) {
            if (a == one.length - 1) {
                System.out.println(two[a]);
                break;
            }
            System.out.print(two[a] + ", ");
        }

        for (int a = 0; a < three.length; a++) {
            if (a == three.length - 1) {
                System.out.println(three[a]);
                break;
            }
            System.out.print(three[a] + ", ");
        }

        System.out.println("task 3");
        for (int b = one.length - 1; b >= 0; b--) {
            System.out.print(one[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = two.length - 1; b >= 0; b--) {
            System.out.print(two[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = three.length - 1; b >= 0; b--) {
            System.out.print(three[b]);
            if (b != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("task 4");

        for (int c = 0; c < one.length; c++) {
            if (one[c] % 2 != 0) {
                one[c] += 1;
            }
        }
        System.out.print(Arrays.toString(one));


    }
}