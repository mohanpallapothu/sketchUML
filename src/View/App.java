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
       
    }

    public static void main(String[] args) {
        new App();
    }

}
