//Вывести таблицу умножения в консоль
public class Ex1_1 {
    public static void main(String[] args) {
        int endNum = 9;
        int val;
        for(int i = 1; i <= endNum; i++) {
            for(int j = 1; j <= endNum; j++){
                val = i * j;
                System.out.print(i + "*" + j + "=" + val + "   ");
            }
            System.out.println();
        }
    }
}
