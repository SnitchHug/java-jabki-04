public class Main {

    /*
    Задание 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона)
    и возвращает сумму всех чисел между ними (включительно)
     */
    public static int sumRange(int first, int last) {
        int sum = 0;

        while (first <= last) {
            sum += first;
            first++;
        }

        return sum;
    }

    /*
    Задание 2. Создайте два перегруженных метода add: Первый складывает два целых числа;
    Второй складывает две строки
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    // Задание 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент
    public static int findMax(int[] list) {
        int numberMax = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > numberMax) {
                numberMax = list[i];
            }
        }

        return numberMax;
    }

    // Задание 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static int calculateFactorial(int f) {
        if (f < 0) {
            System.out.println("Нельзя вычислить факториал отрицательного числа");
            return f;
        }

        int result = 1;

        for (int i = 1; i <= f ; i++) {
            result *= i;
        }

        return result;
    }

    /*
    Задание 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус);
    Для прямоугольника (принимает длину и ширину)
     */
    public static double calculateArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }

    // Задание 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое
    public static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    /*
    Задание 7. Напишите метод, который принимает два числа, представляющие длины катетов,
    и возвращает длину гипотенузы (используйте теорему Пифагора)
     */
    public static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(-4));
    }
}