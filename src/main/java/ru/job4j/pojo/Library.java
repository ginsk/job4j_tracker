package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book happy = new Book("Drink Happy", 102);
        Book head = new Book("Hard morning", 1);
        Book face = new Book("Terrible mirrow", 8);
        Book life = new Book("Clean code", 1);
        Book[] books = new Book[4];
        books[0] = happy;
        books[1] = head;
        books[2] = face;
        books[3] = life;
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.println(bk.getName() + "-" + bk.getPage());
        }
        System.out.println(" Replace book");
            Book temp = books[0];
            books[0] = books[3];
            books[3] = temp;
            for (int i = 0; i < books.length; i++) {
                Book pk = books[i];
                System.out.println(pk.getName() + "-" + pk.getPage());
            }
        System.out.println(" Show only clean");

        for (int i = 0; i < books.length; i++) {
            Book pk = books[i];
            if (pk.getName() == "Clean code") {
                System.out.println(pk.getName() + "-" + pk.getPage());
            }
        }
        }
    }


