package org.example;

public enum ProductCategory {

    PREMIUM("Премиальный товар"), STANDARD("Не премиальный товар");

    final String translation;

    ProductCategory(String translation) {
        this.translation = translation;

    }
}