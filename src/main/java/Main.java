public class Main {
    public static void main(String[] args) {
        printNumbers();
    }
    //Пробегаемся циклом с заданными условиями.
    public static void printNumbers() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                if (summ(i) < 10) {
                    System.out.println(i);
                }
            }
        }

    }
    //Отдельная функция для провери суммы цифр внутри числа.
    public static int summ(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}