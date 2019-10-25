package hu.uni.eszterhazy.swtest.api.service.exceptions;

public class InvalidISBNException extends Exception {

    public InvalidISBNException() {
    }

    public InvalidISBNException(String s) {
        super(s);
    }

    public InvalidISBNException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public InvalidISBNException(Throwable throwable) {
        super(throwable);
    }

    public InvalidISBNException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
