package ru.andrey;

import ru.andrey.Box.Box;
import ru.andrey.Fruits.Fruit;

public class FruitMover {

    public <T extends Fruit> Box<T> fruitMover(Box<T> from, Box<T> to) {
        to.getFruits().addAll(from.getFruits());
        from.getFruits().clear();
        return to;
    }
}


