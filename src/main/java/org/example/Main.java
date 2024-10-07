package org.example;

import library.Book;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Book newBook=new Book("Atomic Habit","James Clear");
        newBook.getBookInfo();
        newBook.borrowBook();
        newBook.returnBook();


    }
}