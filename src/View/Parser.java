package View;

import Model.UserClass;
import View.CodeViewPanel;

/**
 * This is an interface which parses the UserClasses and updates the code view panel accordingly.
 */
public interface Parser {
    /**
     * This method implements the parsing of UserClass to update the code view panel.
     * @param userClass
     * @param panel
     */
    void parse(UserClass userClass, CodeViewPanel panel);
}
