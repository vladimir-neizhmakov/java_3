import java.util.ArrayList;
import java.util.Arrays;

/*
3. Большая задача:
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можете использовать ArrayList;
d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны,
false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {
    public static void main(String[] args) {
/*
1.Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
*/
        ChangeArrayElementPlace<String> obj = new ChangeArrayElementPlace<>("привет","java3");
        System.out.println(Arrays.toString(obj.ChangePlace()));
/*
2.Написать метод, который преобразует массив в ArrayList;
*/
        System.out.println(obj.ArrToArrayList(obj.ChangePlace()));

/*
a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
 */
        ArrayList<Apple> appleList = new ArrayList<>(); //создаем кучу яблок
        ArrayList<Orange> orangeList = new ArrayList<>(); //создаем кучу апельсинов
        for (int i = 0; i < 10; i++) {
            appleList.add(new Apple());
            orangeList.add(new Orange());
        }

        Box<Apple> appleBox = new Box<>(appleList); //засыпаем кучу яблок в коробку
        Box<Orange> orangeBox = new Box<>(orangeList); //засыпаем кучу апельсинов в коробку

        for (int i = 0; i < 5; i++) {
            appleBox.addFruit(new Apple()); //досыпаем яблок в коробку
        }
        Box<Apple> appleBox1 = new Box<>(appleList); // еще коробка под яблоки

        System.out.println(appleBox.getWeight()); //выводим сколько яблок в коробке
        System.out.println(orangeBox.getWeight()); //выводим сколько апельсинов в коробке

        System.out.println(appleBox.compareBox(orangeBox)); //выводим результат сравнения коробок
        System.out.println(appleBox.peresipatFruit(appleBox1)); //выводим сколько яблок в пересыпанной коробке
    }
}
