package Model;

/**
 * This enum contains the types of connections between the classes.
 */
public enum ConnectionType {
    Association("Association"), Inheritance("Inheritance"), Composition("Composition");
    public String name;
    ConnectionType(String s) {
        this.name = s;
    }
}