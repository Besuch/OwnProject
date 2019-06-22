
public class SelectionSort {

    public static void main(String[] args) {
        Integer[] mas = {5, 90, 11, 99, 87, 70, 0, 7, 88};

        int tempIndex;
        int minElement;
        for (int i = 0; i < mas.length; i++) {
            minElement = mas[i];
            tempIndex = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < minElement) {
                    tempIndex = j;
                    minElement = mas[j];
                }
            }
            if (!mas[i].equals(mas[tempIndex])) {
                mas[tempIndex] = mas[i];
                mas[i] = minElement;
            }
        }

        for (int r : mas) {
            System.out.println(r + " ");
        }
    }
}
