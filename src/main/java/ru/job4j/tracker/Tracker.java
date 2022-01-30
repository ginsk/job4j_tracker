package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] notNull = new Item[size];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                notNull[size] = item;
                size++;
            }
            
        }
        return Arrays.copyOf(notNull, size);
    }

    public Item[] findByName(String key) {
        Item[] tItems =  new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item != null) {
                if (item.getName().equals(key)) {
                    tItems[count] = item;
                    count++;
                }
            }
        }
        return Arrays.copyOf(tItems, count);
    }
}