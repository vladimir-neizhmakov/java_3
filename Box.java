import java.util.ArrayList;
/*
b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */
public class Box<T> {
    private ArrayList<T> fruits; //c. Для хранения фруктов внутри коробки можете использовать ArrayList;

    public Box(ArrayList<T> fruits){
        this.fruits = fruits;
    }

    /*
    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
     */
    public float getWeight(){

        if (fruits.get(0) instanceof Apple){
            return fruits.size() * ((Apple) fruits.get(0)).getWeight();
        } else if (fruits.get(0) instanceof Orange){
            return fruits.size() * ((Orange) fruits.get(0)).getWeight();
        } else
        return 0;
    }
/*
g. Не забываем про метод добавления фрукта в коробку.
 */
    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    /*
    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны,
false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
     */
    public boolean compareBox (Box box){
        return this.getWeight() == box.getWeight();
    }

    /*
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами),
соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
     */
    public int peresipatFruit(Box<T> box){
        int count = this.fruits.size();
        for (int i = 0; i < count; i++) {
            box.fruits.add(this.fruits.get(i));
            this.fruits.remove(i);
        }
        return count;

    }



}
