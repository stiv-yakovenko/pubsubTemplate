package api;

public final class ServerStartupException extends Exception {
    public ServerStartupException() {
    }

    public ServerStartupException(final String message) {
        super(message);
    }

    public ServerStartupException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ServerStartupException(final Throwable cause) {
        super(cause);
    }

    public ServerStartupException(final String message,
                                  final Throwable cause,
                                  final boolean enableSuppression,
                                  final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}