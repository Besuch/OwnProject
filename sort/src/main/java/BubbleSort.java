class BubbleSort {

    public static void main(String[] args) {
        Integer[] mas = {5, 90, 99, 87, 11, 70, 0, 7, 88};

        int w;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                if (mas[j] > mas[j + 1]) {
                    w = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = w;
                }
            }
        }

        for (int i : mas) {
            System.out.print(i + " ");
        }
    }
}