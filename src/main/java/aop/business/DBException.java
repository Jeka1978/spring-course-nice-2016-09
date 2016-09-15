package aop.business;

/**
 * Created by Jeka on 15/09/2016.
 */
public class DBException extends RuntimeException {
    public DBException(String message) {
        super(message);
    }
}
