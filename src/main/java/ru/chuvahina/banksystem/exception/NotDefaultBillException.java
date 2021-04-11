package ru.chuvahina.banksystem.exception;

public class NotDefaultBillException extends RuntimeException {
    public NotDefaultBillException(String message) {
        super(message);
    }
}
