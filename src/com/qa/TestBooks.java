package com.qa;

import java.util.Arrays;

public class TestBooks {
 private String name;
 private String[] authors;
 private double price;

    public TestBooks(String name, String[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String[] getAuthors() {
 return authors;
 }
    public void setAuthors(String[] authors){
        this.authors = authors;
    }
 public double getPrice() {
 return price;
 }
 public void setPrice(double price) {
 this.price = price;
 }

    @Override
    public String toString() {
        return "Book [name=" + name + ", authors=" +
        Arrays.toString(authors) + ", price=" + price + "]";
    }
}
