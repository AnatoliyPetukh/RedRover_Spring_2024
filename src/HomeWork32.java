public class HomeWork32 {
    public static void main(String[] args){
        System.out.println("Задание 1");
        //Необходимо вывести числа от 0 до 15.
        for (int i = 0; i <= 15; i++){System.out.println(i);}
        System.out.println("Задание 2");
        //Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
        int i=1;
        while (Math.pow(5, i)<10000){
        System.out.println((int)Math.pow(5, i));
        i++;}
        System.out.println("Задание 3");
        //Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        //Реализовать 2 варианта:
        //использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        //без использования конструкции if (шаг цикла на ваше усмотрение).
        System.out.println("C if:");
        for (i = 40; i <= 60; i++){
            if(i % 4==0) {System.out.println(i);}
        }
        System.out.println("Без if:");
        for (i = 40; i <= 60; i+=4){System.out.println(i);}
    }
}
