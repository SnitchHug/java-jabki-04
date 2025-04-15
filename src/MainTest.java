import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumRange() {
        int a = 4;
        int b = 7;
        Assertions.assertEquals(22, Main.sumRange(a, b));
    }

    @Test
    void add() {
        int a = 10;
        int b = 3;
        Assertions.assertEquals(a + b, Main.add(a, b));
    }

    @Test
    void testAdd() {
        String a = "Привет,";
        String b = " Мир!";
        Assertions.assertEquals(a + b, Main.add(a, b));
    }

    @Test
    void findMax() {
        int[] list = {2, 35, 0, -5, 6, 78, 11, 12, 99};
        Assertions.assertEquals(99, Main.findMax(list));
    }

    @Test
    void calculateFactorial() {
        int a = 5;
        Assertions.assertEquals(120, Main.calculateFactorial(a));
    }

    @Test
    void calculateArea() {
        int a = 5;
        Assertions.assertEquals(3.14 * a * a, Main.calculateArea(a));
    }

    @Test
    void testCalculateArea() {
        int a = 7;
        int b = 10;
        Assertions.assertEquals(a * b, Main.calculateArea(a, b));
    }

    @Test
    void calculateAverage() {
        int a = 4;
        int b = 7;
        int c = 25;
        Assertions.assertEquals((a + b + c) / 3, Main.calculateAverage(a, b, c));
    }

    @Test
    void calculateHypotenuse() {
        int a = 8;
        int b = 6;
        Assertions.assertEquals(10, Main.calculateHypotenuse(a, b));
    }
}