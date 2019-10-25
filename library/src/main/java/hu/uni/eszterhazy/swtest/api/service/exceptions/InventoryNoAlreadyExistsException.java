package hu.uni.eszterhazy.swtest.api.service.exceptions;

public class InventoryNoAlreadyExistsException extends Exception {

    public InventoryNoAlreadyExistsException() {
    }

    public InventoryNoAlreadyExistsException(String s) {
        super(s);
    }

    public InventoryNoAlreadyExistsException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public InventoryNoAlreadyExistsException(Throwable throwable) {
        super(throwable);
    }

    public InventoryNoAlreadyExistsException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
