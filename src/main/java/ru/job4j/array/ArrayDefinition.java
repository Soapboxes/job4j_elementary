package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        Short[] ages = new Short[10];
        String[] surnames = new String[100500];
        Float[] prices = new Float[40];
        String[] names = new String[4];
        names[0] = "strong";
        names[1] = "hard";
        names[2] = " massiv";
        names[3] = "work";
        System.out.println("Массивы names: " + names[0] + " " + names[1] + " " + names[2] + " " + names[3]);
        System.out.println(names[3]);
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
    }
}
