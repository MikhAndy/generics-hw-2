package ru.andrey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.andrey.Box.Box;
import ru.andrey.Fruits.Orange;

class FruitMoverTest {
    Orange orange = new Orange(2);

    Box<Orange> firstBox = new Box<>(orange,orange,orange);
    Box<Orange> secondBox = new Box<>(orange,orange);

    FruitMover fruitMover = new FruitMover();

    @Test
    void fruitMoverTest() {
        System.out.println("Вес ПЕРВОЙ коробки с апельсинами ДО: " + firstBox.getWeight());
        System.out.println("Вес ВТОРОЙ коробки с апельсинами ДО: " + secondBox.getWeight());
        int weightFirstBoxBefore = firstBox.getWeight();
        int weightSecondBoxBefore = secondBox.getWeight();
        fruitMover.fruitMover(firstBox,secondBox);
        System.out.println("Вес ПЕРВОЙ коробки с апельсинами ПОСЛЕ: " + firstBox.getWeight());
        System.out.println("Вес ВТОРОЙ коробки с апельсинами ПОСЛЕ: " + secondBox.getWeight());

        Assertions.assertEquals(secondBox.getWeight(), weightFirstBoxBefore + weightSecondBoxBefore);
    }
}