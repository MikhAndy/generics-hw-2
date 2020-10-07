package ru.andrey.Box;

/*
   Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
   Для хранения фруктов внутри коробки можно использовать ArrayList;
   Сделать метод getWeight(), который высчитывает вес коробки. Задать вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
   Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны,
        false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
   Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
   Не забываем про метод добавления фрукта в коробку
*/


import ru.andrey.Fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public List<T> getFruits() {
        return fruits;
    }

    public boolean addFruits(T fruit, int count) {
        int sizeBefore = this.fruits.size();
        while (count != 0) {
        this.fruits.add(fruit);
        count--;
        }
        int sizeAfter = this.fruits.size();
        return sizeBefore == sizeAfter;
    }

    public int getWeight() {
        int weight = 0;
        for (T t : fruits) {
            weight += t.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> other) {
        return getWeight() == other.getWeight();
    }
}
