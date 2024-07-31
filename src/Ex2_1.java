//Перебрать все элементы массива вывести их в консоль при помощи do....while, while, for, foreach
public class Ex2_1 {
    public static void main(String[] args) {
        int j = 0;
        int k = 0;
        int[] intArray1 = new int[]{1,8,12,133};
        int[] intArray2 = new int[]{545,89,12,1};
        int[] intArray3 = new int[]{125,1544,154,1555};
        String[] intArray4 = new String[]{"Кот","Собака","Кролик","Дракон"};
        //do....while
        System.out.println("do....while");
        if (intArray1.length == 0){
            System.out.println("Пустой массив");
        }
        if (intArray1.length > 0) {
            do{
                System.out.println(intArray1[j]);
                j = j + 1;
            }
            while(j < intArray1.length);
        }
        System.out.println("");

        //while
        System.out.println("while");
        while (k < intArray2.length){
            System.out.println(intArray2[k]);
            k = k + 1;
        }

        System.out.println("");

        //for
        System.out.println("for");
        for (int i = 0; i < intArray3.length; i++){
            System.out.println(intArray3[i]);
        }

        System.out.println("");
        //foreach
        System.out.println("foreach");
        for (String l : intArray4){
            System.out.println(l);
        }



    }
}
