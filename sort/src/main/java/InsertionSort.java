
public class InsertionSort {

    public static void main(String[] args) {
        Integer[] mas = {5, 90, 11, 99, 87, 70, 0, 7, 88};

        int temp;
        int j;
        for (int i = 1; i < mas.length; i++) {
            temp = mas[i];
            for (j = i - 1; j >= 0 && mas[j] > temp; j--) {
                mas[j + 1] = mas[j];
            }
            mas[j + 1] = temp;
        }

        for (int i : mas) {
            System.out.print(i + " ");
        }
    }
}
