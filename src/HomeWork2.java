import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Задача №1
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("сумма чисел: " + (a+b));
        if (a >= b) {
            System.out.println("разница чисел: " + (a-b));
        } else {
            System.out.println("разница чисел: " + (b-a));
        }
        System.out.println("умножение: " + (a*b));
        System.out.println("деление: " + (a/b));
        System.out.println("остаток: " + (a%b));
        if ((a % 2)==0) {
            System.out.println("Число a четное");
        }else {
            System.out.println("Число a нечетное");
        }
        if ((b % 2)==0) {
            System.out.println("Число b четное");
        }else {
            System.out.println("Число b нечетное");
        }
        //Задача №2
        System.out.println("Введите величину добычи: ");
        int gross = scanner.nextInt();
        System.out.println("Количество моряков: ");
        int crew = scanner.nextInt();
        int salaryOwner = gross/2;
        int rest = gross % 2;
        int salaryCap = (salaryOwner)/2;
        rest += (salaryOwner)%2;
        int salaryCrew = (salaryOwner/2) / (crew+1);
        rest += (salaryOwner/2) % (crew+1);
        int salaryFullCap = salaryCap + salaryCrew;
        System.out.println("Выплата владельцу корабля: " + salaryOwner);
        System.out.println("Выплата капитану корабля: " + salaryFullCap);
        System.out.println("Выплата в случае, если капитан Джек Воробей: " + (salaryFullCap+salaryOwner));
        System.out.println("Выплата члену команды корабля: " + salaryCrew);
        System.out.println("Остаток для инвестиций в корабль: " + rest);
        if ((salaryCrew*crew+salaryFullCap+salaryOwner+rest) == gross){
            System.out.println("Все выплаты произведены верно!");
        }
    }
}
