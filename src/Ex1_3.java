import java.util.Scanner;

//Все цифры из числа введенного через аргумент (или через консоль) к исполняемой программе перемножить между
// собой и вывести ход вычислений в консоль
public class Ex1_3 {
    public static void main(String[] args) {
        int result = 1;
        int scanValue;
        int numbValue;
        int numVal = 0;

        System.out.println("Введите число");

        Scanner scanner = new Scanner(System.in);
        scanValue = scanner.nextInt();

        while (scanValue > 0){
            numVal = numVal + 1;
            numbValue = scanValue % 10;
            if (numVal == 1){
                System.out.println("Умножаем с конца. Последняя цифра - " + numbValue);
                result = result * numbValue;
            }
            if (numVal != 1) {
                System.out.println("Следующая цифра - " + numbValue + ": " + result + "*" + numbValue + "=" + result * numbValue);
                result = result * numbValue;
            }

            scanValue = scanValue / 10;
        }
        System.out.println("Результат вычислений = " + result);

    }

}
