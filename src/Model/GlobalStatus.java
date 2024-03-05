package Model;

import java.util.Observable;

/**
 * This singleton class is the source of information for the status bar.
 */
public class GlobalStatus extends Observable {
    private static GlobalStatus instance;
    ConnectionType connectionType = ConnectionType.Association;
    String drawStatus = "No class selected";
    private GlobalStatus() {}
    public static GlobalStatus getInstance() {
        if (instance == null) {
            instance = new GlobalStatus();
        }
        return instance;
    }

    /**
     * This method updates the connection type selected by the user and notifies the views.
     * @param type
     */
    public void setConnectionType(ConnectionType type) {
        connectionType = type;
        this.setChanged();
        this.notifyObservers();
    }
    public ConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * This method updates the user activity and notifies the views.
     * @param status
     */
    public void setDrawStatus(String status) {
        drawStatus = status;
        this.setChanged();
        this.notifyObservers();
    }
    public String getDrawStatus() {
        return drawStatus;
    }
}
