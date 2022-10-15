public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Задание 1!!!");
        int totalMonth = 0;
        for (int j : arr) {
            totalMonth += j;
        }
        System.out.println("Сумма трат за месяц составила " + totalMonth + " рублей.");
        System.out.println("Задание 2!!!");
        int maxArr = -1;
        int minArr = 1_000_000;
        for (int j : arr) {
            if (j > maxArr) {
                maxArr = j;
            }
            if (j < minArr) {
                minArr = j;
            }
        }
        System.out.println("Минимальна сумма трат за день составила " + minArr + " рублей. Максимальная сумма трат за день составила " + maxArr + " рублей.");
        System.out.println("Задание 3!!!");
        double averageArr = 0;
        if (arr.length > 0){
            double sum = 0;
            for (int j : arr) {
                sum += j;

            }
            averageArr = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageArr+ " рублей.");
        System.out.println("Задание 4!!!");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("Спасибо за проверку!");


    }
}