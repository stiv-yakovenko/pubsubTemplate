package api;
public interface PubSubServer {
    /**
     * @return true if the server has been started
     */
    boolean isRunning();

    /**
     * Starts the server.
     * @param config configuration to use
     * @throws ServerStartupException if for some reason server can't be started (like maybe it's already running)
     */
    void start(ServerConfig config) throws ServerStartupException;

    /**
     * Stops the server.
     * Cleans up resources: stops all working threads, 'frees' all allocated memory, etc.
     */
    void stop();
}