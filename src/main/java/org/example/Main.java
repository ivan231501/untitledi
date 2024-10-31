package org.example;

public class Main {
    public static void main(String[] args) {
        String name ="Петя";
        int age =  33;
        String profession = "Водитель";
        String phrase = " Всем привет, меня зовут " + name + " мне " + age + " я работаю " + profession ;
        String formatString = String.format(" Всем привет, меня зовут  %s мне %d  работаю + %s", name, age ,profession);
        System.out.println(formatString);
    }
}