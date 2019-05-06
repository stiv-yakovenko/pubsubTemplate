package api;
public final class ServerConfig {
    public ServerConfig(int port, int workersNumber) {
        this.port = port;
        this.workersNumber = workersNumber;
    }

    public int getPort() {
        return port;
    }

    public int getWorkersNumber() {
        return workersNumber;
    }

    private final int port;
    private final int workersNumber;
}
