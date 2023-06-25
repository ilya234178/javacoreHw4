package org.example;

public class TooMuchSaleException extends RuntimeException {
    public TooMuchSaleException(String msg) {
        super(msg);
    }
}