package mate.academy.exception;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String text) {
        super(text);
    }

    public AuthenticationException(String text, Exception e) {
        super(text, e);
    }
}
