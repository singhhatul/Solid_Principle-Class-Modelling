package com.stackroute.solid;

import java.sql.SQLOutput;
import java.util.Scanner;

class Text {
    private String text;
    private String author;
    private int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text='" + text + '\'' +
                ", author='" + author + '\'' +
                ", length=" + length +
                '}';
    }
    void allLettersToUpperCase() {
        System.out.println("I am in TEXT class and converting all lowercase to upper case\n");
    }
    void findSubTextAndDelete(String s) {
        System.out.println("I am in TEXT class and "+s+" deleted from TEXT\n");
    }
    void printText() {
        System.out.println("I am in TEXT class and printing TEXT\n");
    }
}
