package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
        switch (name) {
            case "super mario":
                System.out.println("Start - super mario");
                break;
            case "tanks":
                System.out.println("Start - tanks");
                break;
            case "tetris":
                System.out.println("Start - tetris");
                break;
            default:
                System.out.println("Game not found");
                break;
        }
    }

    public static void main(String[] args) {
        Game.menu("tanks");
    }
}
