package View;

import Model.GlobalStatus;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * This class represents the below status bar of the application.
 * This observes the changes in the GlobalStatus class and updates accordingly.
 */
public class StatusBar extends JPanel implements Observer {

    JLabel status;
    JLabel connection;

    public StatusBar(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.setBorder(BorderFactory.createLineBorder(ViewConstants.accentColor, 2));
        this.setBackground(Color.white);
        status = new JLabel(GlobalStatus.getInstance().getDrawStatus());
        status.setBounds(10, 5, 400, 25);
        connection = new JLabel(GlobalStatus.getInstance().getConnectionType().name);
        connection.setBounds(915, 5,100,25);
        this.setLayout(null);
        this.add(status);
        this.add(connection);
    }

    /**
     * Method to update the status bar with the latest data.
     * @param o     the observable object.
     * @param arg   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object arg) {
        status.setText(GlobalStatus.getInstance().getDrawStatus());
        connection.setText(GlobalStatus.getInstance().getConnectionType().name);
    }
}
