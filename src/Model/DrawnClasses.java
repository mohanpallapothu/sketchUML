package Model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * This singleton class contains all the classes that have been created by the user.
 * This acts as observable for the views to update when there is a change in the data.
 */
public class DrawnClasses extends Observable {

    private static DrawnClasses instance;
    ArrayList<UserClass> classes = new ArrayList<>();

    private DrawnClasses() {}

    /**
     * Method to get the only single instance of the class.
     * @return
     */
    public static DrawnClasses getInstance() {
        if (instance == null) {
            instance = new DrawnClasses();
        }
        return instance;
    }

//    public boolean loadFromFile(String fileName) {
//        FileProcessor processor = new FileProcessor();
//        processor.load
//    }

    public int getLength() {
        return classes.size();
    }

    public UserClass getClassByID(int id) {
        return classes.get(id);
    }

    public ArrayList<UserClass> getClasses() {
        return classes;
    }

    /**
     * Creates new class with the given data and notifies the views.
     * @param x
     * @param y
     * @param name
     */
    public void addUserClass(int x, int y, String name) {
        classes.add(new UserClass(x, y, name));
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Modifies the position of the class when there is a drag in the view and notifies the views.
     * @param id
     * @param x
     * @param y
     */
    public void changeClassPosition(int id, int x, int y) {
        classes.get(id).setCenter(x, y);
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * Creates a new connection between two classes and notifies the views.
     * @param from
     * @param to
     * @param type
     */
    public void addConnection(int from, int to, ConnectionType type) {
        Connection c = new Connection(classes.get(to), to, type);
        classes.get(from).addConnection(c);
        this.setChanged();
        this.notifyObservers();
    }

    /**
     * This method removes all the user classes created and notifies the views.
     */
    public void reset() {
        classes.clear();
        this.setChanged();
        this.notifyObservers();
    }
}
