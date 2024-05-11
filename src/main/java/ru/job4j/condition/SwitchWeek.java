package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String[] days = {"Понедельник", "Вторник", "Среда", "Четверг",
                "Пятница", "Суббота", "Воскресенье"};
        if (day >= 1 && day <= 7) {
            return days[day - 1];
        } else {
            return "Ошибка";
        }
    }
}
