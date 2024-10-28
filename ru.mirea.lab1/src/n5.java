public class n5 {
    public static void main(String[] args) {
        int number = 5; // Пример числа для вычисления факториала
        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Вычисление факториала
        }
        return result;
    }
}