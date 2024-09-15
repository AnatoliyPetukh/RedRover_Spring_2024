public class HomeWork52 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        //Дана строка:
        //String s = “Перестановочный алгоритм быстрого действия”;
        //необходимо вывести все буквы “о” из этой строки.
        //Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        char symbol = 'о';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == symbol) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        System.out.println("Задание 2");
        //Дана строка:
        //String s = “Перевыборы выбранного президента”;
        //необходимо подсчитать количество букв “е” в строке.
        //Для указанной строки ответ будет 4
        String s1 = "Перевыборы выбранного президента";
        symbol = 'е';
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println("количество букв “е” в строке " + count);
        System.out.println("Задание 3");
        //Дана строка:
        //String s = “Посмотрите как Рите нравится ритм”;
        //необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
        //Для указанной строки ответ будет 6, 15, 29.
        String s2 = "Посмотрите как Рите нравится ритм";
        String s3 = s2.toLowerCase();
        String s4 = "рит";
        int index = 0;
        while (true) {
            index = s3.indexOf(s4, index);
            if (index == -1) {
                break;
            }
            System.out.println(index);
            index++;
        }
        System.out.println("Задание 4");
        //Дан массив:
        //String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        //необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int quantity_e = 0;
        for (String[] i : array) {
            for (String j : i){
                if (!j.contains("е")){
                    quantity_e++;
                }
            }
        }
        System.out.println(quantity_e);
    }
}