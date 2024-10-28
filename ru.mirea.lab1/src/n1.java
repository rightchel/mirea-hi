public class n1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Инициализация массива
        int sum = 0;

        for (int number : numbers) {
            sum += number; // Суммирование элементов
        }

        double average = (double) sum / numbers.length; // Среднее арифметическое
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}