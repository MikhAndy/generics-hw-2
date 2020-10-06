package ru.andrey;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(2, 4);
        Orange orange = new Orange(3,5);

        Box<Apple> appleBox = new Box(apple);
        Box<Orange> orangeBox = new Box(orange);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

    }
}
