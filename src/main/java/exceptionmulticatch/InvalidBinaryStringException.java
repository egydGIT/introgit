package exceptionmulticatch;

public class InvalidBinaryStringException extends RuntimeException{

    public InvalidBinaryStringException() {
    }

    public InvalidBinaryStringException(String message) {
        super(message);
    }

    public InvalidBinaryStringException(Throwable cause) {
        super(cause);
    }
}
