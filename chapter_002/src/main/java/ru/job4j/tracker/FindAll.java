package ru.job4j.tracker;

import java.util.*;

public class FindAll extends BaseAction {
    public FindAll(int key, String name) {
        super(key, name);
    }
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Все заявки : --------------");
        List<Item> array = tracker.findAll();
        for (Item item : array) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getDecs());
        }
    }
}

