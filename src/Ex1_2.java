// Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе
public class Ex1_2 {

    public static void main(String[] args) {
        int result;
        int resultFactorial;

        resultFactorial = factorial(3);
        System.out.println("Результат факториалом: " + resultFactorial);

        result = getResult(3);
        System.out.println("Результат циклом для практики синтаксиса: " + result);
    }

    public static int factorial(int x){
        if (x == 1){
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static int getResult(int val) {
        int result = 1;

        for (int i = 1; i <= val; i++) {
            result = result * i;
        }
        return result;
    }


}
