package View;

import Model.*;

import javax.swing.*;
import java.awt.*;

/**
 * Primary JFrame with all panels
 *
 * @author mohanpallapothu
 * @version 1.0.0
 */
public class App extends JFrame {



    /**
     * Sets up UI components and displays the JFrame
     */
    public App() {
        JMenuBar menuBar;
        JMenuItem save = new JMenuItem("Save");
        JMenuItem load = new JMenuItem("Load");
        JMenuItem clear = new JMenuItem("Clear");
        JMenuItem association = new JMenuItem(ConnectionType.Association.name);
        JMenuItem inheritance = new JMenuItem(ConnectionType.Inheritance.name);
        JMenuItem aggregation = new JMenuItem(ConnectionType.Composition.name);
        JMenuItem member_1 = new JMenuItem(TeamList.YAGAA.name);
        JMenuItem member_2 = new JMenuItem(TeamList.CHINMAY.name);
        JMenuItem member_3 = new JMenuItem(TeamList.SNIGDHA.name);
        JMenuItem member_4 = new JMenuItem(TeamList.MOHAN.name);
        menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenu connectionType = new JMenu("Connection");

    }

    public static void main(String[] args) {
        new App();
    }

}
