package exceptions;

public class DatabaseNotSelectedException extends Throwable {
    public DatabaseNotSelectedException() {
        this("Database was not selected! Type use <db-name> to select or create new one");
    }

    public DatabaseNotSelectedException(String message) {
        super(message);
    }
}
