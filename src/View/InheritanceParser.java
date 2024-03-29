package View;

import Model.Connection;
import Model.ConnectionType;
import Model.UserClass;

import java.util.ArrayList;

/**
 * This class is part of the chain of responsibility design pattern.
 * This parses the user class and updates code view panel with the inheritance classes in it.
 */
public class InheritanceParser extends ChainableParser {

    @Override
    public void parse(UserClass userClass, CodeViewPanel panel) {
        boolean extended = false;
        panel.appendToPanel("class "+ userClass.getTitle(), ViewConstants.baseSyntaxColor);
        ArrayList<Connection> connections = userClass.getConnections();
        for (int i=0; i<connections.size(); i++) {
            if (connections.get(i).getType() == ConnectionType.Inheritance) {
                if (extended) {
                    panel.appendToPanel(", " + connections.get(i).getToClass().getTitle(), ViewConstants.baseSyntaxColor);
                } else {
                    extended = true;
                    panel.appendToPanel(" extends " + connections.get(i).getToClass().getTitle(), ViewConstants.baseSyntaxColor);
                }
            }
        }
        panel.appendToPanel(" {\n", ViewConstants.baseSyntaxColor);
        if(getNextParser() != null) {
            getNextParser().parse(userClass, panel);
        }
    }
}
