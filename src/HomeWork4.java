import java.util.Arrays;
import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args){
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все нечетные числа из массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        System.out.println("Результаты задания 1:");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо вывести все значения массива больше 5.
        System.out.println("Результаты задания 2:");
        for (int j : array) {
            if (j > 5) {
                System.out.println(j);
            }
        }
        //Дан массив:
        //int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        //необходимо увеличить все значения массива на 15.
        System.out.println("Результаты задания 3:");
        for (int i=0; i<array.length ; i++){
            array[i]+=15;
        }
        System.out.println(Arrays.toString(array));
        //Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
        //Необходимо изменить порядок элементов массива на противоположный
        // (т.е. чтобы получилось { 10, 9, …, 2, 1 } ).
        // Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
        System.out.println("Результаты задания 4:");
        int[] newArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }
        System.out.println("Дан массив: " + Arrays.toString(newArray));
        for (int i = 0; i < newArray.length/2; i++) {
            int mem = newArray[i];
            newArray[i] = newArray[newArray.length-1-i];
            newArray[newArray.length-1-i] = mem;
        }
        System.out.println("Перевернутый массив: " + Arrays.toString(newArray));
    }
}
