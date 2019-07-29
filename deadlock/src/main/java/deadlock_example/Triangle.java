package deadlock_example;

public class Triangle {
    int perimeterTriangle(int line1, int line2, int line3) {

        int perimeter = line1 + line2 + line3;
        System.out.println("Triangle perimeter: " + perimeter);
        return perimeter;
    }
}