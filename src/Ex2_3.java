//Вывести каждый второй элемент массива и если выводимый элемент == null то прекратить перебор массива
public class Ex2_3 {
    public static void main(String[] args) {
        String[] arrayStr = new String[]{"Один","Два","Три",null,"Пять"};

        for(int i = 0; i < arrayStr.length; i++){
            if(i % 2 != 0){
                if (arrayStr[i] == null){
                    break;
                }
                System.out.println(arrayStr[i]);
            }
        }
    }
}
