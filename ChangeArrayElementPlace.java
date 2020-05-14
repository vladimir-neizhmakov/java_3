import java.util.ArrayList;
import java.util.Arrays;

public class ChangeArrayElementPlace<T> {
    private T[] arr;

    public ChangeArrayElementPlace(T... arr){
        this.arr = arr;
    }

/*
1.Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
*/
    public T[] ChangePlace(){
        if (arr.length >= 1) {
            T a = arr[0];
            arr[0]=arr[1];
            arr[1]=a;
        }
        return arr;
    }

/*
2.Написать метод, который преобразует массив в ArrayList;
*/
    public ArrayList<T> ArrToArrayList (T[] arr){
       return new ArrayList<T>(Arrays.asList(arr));
    }
}
