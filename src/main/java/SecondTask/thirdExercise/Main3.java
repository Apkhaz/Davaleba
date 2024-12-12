package SecondTask.thirdExercise;

public class Main3 {
    public static void main(String[] args) {
        int[] array = {17, -25, 2, -5, 9, 75, 11, 0, -83};
        int x = array.length;

        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Array-ს მნიშნვნელობები ზრდადობით: ");
        for (int i = 0; i < x; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
