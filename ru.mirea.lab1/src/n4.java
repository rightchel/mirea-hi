public class n4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            double harmonicNumber = 1.0 / i;
            System.out.printf("H(%d) = %.4f%n", i, harmonicNumber); // Форматированный вывод
        }
    }
}