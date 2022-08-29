package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        String probel = " ";
        System.out.println(idea);
        idea = idea + probel +"But I am just learning.";
        int year = 2022;
        idea = idea + probel + year;
        idea += probel + "год.";
        System.out.println(idea);
    }
}
