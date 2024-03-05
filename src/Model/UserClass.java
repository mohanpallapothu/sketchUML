package Model;

import java.util.ArrayList;

/**
 * This class represents a single user class created by the user.
 * This contains the position, name and the connections of the class.
 */
public class UserClass {

    Point center;
    String title;
    ArrayList<Connection> connections = new ArrayList<>();

    public UserClass(int x, int y, String name) {
        this.center = new Point(x,y);
        this.title = name;
    }

    public void setCenter(int x, int y) {
        this.center = new Point(x, y);
    }

    public void addConnection(Connection c) {
        connections.add(c);
    }

    public String getTitle() {
        return title;
    }

    public int xCoord() {
        return center.xCoord();
    }

    public int yCoord() {
        return center.yCoord();
    }

    public ArrayList<Connection> getConnections() {
        return connections;
    }

}
