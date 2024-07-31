//Вывести каждый второй элемент массива
public class Ex2_2 {
    public static void main(String[] args) {
        int [] arrayInt = new int[] {44, 55, 66, 77, 88};

        for (int i = 0; i < arrayInt.length; i++){
            if (i % 2 != 0){
                System.out.println("Элемент [" + i + "] - " + arrayInt[i]);
            }
        }
    }

}
