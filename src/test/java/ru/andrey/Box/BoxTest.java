package ru.andrey.Box;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.andrey.Fruits.Apple;
import ru.andrey.Fruits.Orange;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

        Apple apple = new Apple(1);
        Orange orange = new Orange(2);

        Box<Apple> appleBox = new Box<>(apple,apple,apple);
        Box<Orange> orangeBox = new Box<>(orange,orange);

    @Test
    void getWeightTest() {
        int weight = orangeBox.getFruits().size() * orange.getWeight();
        assertEquals(orangeBox.getWeight(), weight);
    }

    @Test
    void addFruitsTest() {
        int before;
        int after;
        before = appleBox.getWeight();
        appleBox.addFruits(apple,3);
        after = appleBox.getWeight();
        Assertions.assertTrue(after != before);
    }

    @Test
    void compareTest() {
        boolean actual = appleBox.compare(orangeBox);
        Assertions.assertFalse(actual);
    }
}