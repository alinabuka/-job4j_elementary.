package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        name = new String("super mario");
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        name = new String("tanks");
        if ("tanks".equals(name)) {
            System.out.println("Start - tanks");
        }
        name = new String("tetris");
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("super mario");
        Game.menu("tanks");
        Game.menu("tetris");
    }
}
