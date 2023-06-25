package org.example;

public enum Sex {

    MALE("Мужчина"), FEMALE("Женщина"), GENDERLESS("Пол не указан");

    final String translation;

    Sex(String translation) {
        this.translation = translation;

    }
}