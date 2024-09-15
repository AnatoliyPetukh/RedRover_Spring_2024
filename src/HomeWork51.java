public class HomeWork51 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести сумму всех значений массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Сумма всех значений массива " + sum);
        System.out.println("Задание 2");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести максимальное значение массива.
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Максимальное значение массива " + max);
        System.out.println("Задание 3");
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести минимальное значение массива.
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i <min) {
                min = i;
            }
        }
        System.out.println("Минимальное значение массива " + min);
        System.out.println("Задание 4");
        //Дан массив:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //необходимо вывести среднее арифметическое всех значений массива.
        sum = 0;
        for (int i : array) {
            sum += i;
        }
        double a_Mean = (double) sum / array.length;
        System.out.printf("Среднее арифметическое всех значений массива: %.2f%n", a_Mean);
        System.out.println("Задание 5");
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести сумму элементов массива.
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum2 = 0;
        for (int[] i : array2){
            for (int j : i){
                sum2+=j;
            }
        }
        System.out.println("Сумма элементов массива " + sum2);
        System.out.println("Задание 6");
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести максимальное значение массива.
        int max2 = Integer.MIN_VALUE;
        for (int[] i : array2){
            for (int j : i){
                if (j>max2){
                    max2=j;
                }
            }
        }
        System.out.println("Максимальное значение массива " + max2);
        System.out.println("Задание 7");
        //Дан массив:
        //int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        //необходимо вывести количество элементов в массиве.
        int length = 0;
        for (int[] i : array2){
            length+= i.length;
            }
        System.out.println("Количество элементов в массиве " + length);
    }
}
