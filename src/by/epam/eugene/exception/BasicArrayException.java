package by.epam.eugene.exception;

public class BasicArrayException extends Exception {
    public BasicArrayException() {
    }
    public BasicArrayException(String message) {
        super(message);
    }
    public BasicArrayException(String message, Throwable cause) {
        super(message, cause);
    }
    public BasicArrayException(Throwable cause) {
        super(cause);
    }
}
