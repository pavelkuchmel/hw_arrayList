import java.util.ArrayList;
import java.util.Random;
public class hwArrayList {
    public static void main(String[] args){
        /*
--------Павел Кучмель-------------------------------------------------------------------------------
         */
        ArrayList<Integer> array = new ArrayList<Integer>();
        //1. Задан массив A, содержащий 10 целых случайных чисел от 0 до 20.
        //Найти произведение элементов этого массива.
        //2. Задан массив, который содержит 8 случайных целых чисел от -10 до 10.
        //Найти сумму положительных элементов массива.
        //3. Задан массив, который содержит 16 случайных целых чисел от 0 до 20.
        //Найти количество элементов массива, которые делятся на 3 и на 5.
        //4. Задан массив из 9 целых чисел  от -10 до 10.
        //Найти сумму элементов массива, которые являются четными числами.
        one(array);
        two(array);
        three(array);
        four(array);
    }
    static void fillArray (ArrayList<Integer> arrayName, int left, int right, int qnt){
        Random rdm = new Random();
        for (int i = 0; i < qnt; i++){
            arrayName.add(rdm.nextInt(right-left+1)+left);
        }
    }
    static void one (ArrayList<Integer> arrayName){
        arrayName.clear();
        fillArray(arrayName, 0, 20, 10);
        int mult = 1;
        for (int i = 0; i < arrayName.size(); i++){
            mult *= arrayName.get(i);
        }
        System.out.println("The product all  array elements: "+mult);
    }
    static void two (ArrayList<Integer> arrayName){
        arrayName.clear();
        fillArray(arrayName, -10, 10, 8);
        int sum = 0;
        for (int i = 0; i<arrayName.size(); i++){
            if (arrayName.get(i)>0){
                sum += arrayName.get(i);
            }
        }
        System.out.println("The sum all array elements: "+sum);
    }
    static void three (ArrayList<Integer> arrayName){
        arrayName.clear();
        fillArray(arrayName, 0, 20, 16);
        int qnt = 0;
        for (int i = 0; i<arrayName.size(); i++){
            if (arrayName.get(i)%3==0&&arrayName.get(i)%5==0){
                qnt++;
            }
        }
        System.out.println("Quantity array elements that divisible by 3 and 5: "+qnt);
    }
    static void four (ArrayList<Integer> arrayName){
        arrayName.clear();
        fillArray(arrayName, -10, 10, 9);
        int sum = 0;
        for (int i = 0; i<arrayName.size(); i++){
            if (arrayName.get(i)%2==0){
                sum += arrayName.get(i);
            }
        }
        System.out.println("Sum even array elements: "+sum);
    }
    static void showArray (ArrayList<Integer> arrayName){
        for (int i = 0; i<arrayName.size();i++){
            System.out.print(arrayName.get(i)+" ");
        }
    }
}