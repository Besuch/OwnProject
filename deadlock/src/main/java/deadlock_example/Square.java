package deadlock_example;

public class Square {
    int perimeterSquare(int num1, int num2) {

        int perimeter = (num1 + num2) * 2;
        System.out.println("Square perimeter: " + perimeter);
        return perimeter;
    }
}