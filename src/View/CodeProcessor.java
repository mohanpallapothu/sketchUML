package View;

import Model.DrawnClasses;
import Model.UserClass;

import java.awt.*;

/**
 * This class uses the Chainable parser to parse all the user classes and update the code view panel.
 */
public class CodeProcessor {

    ChainableParser headParser;

    public CodeProcessor() {
        setupParseChain();
    }

    /**
     * This method setups the responsibility chain by setting the successors.
     */
    private void setupParseChain() {
        headParser = new InheritanceParser();
        ChainableParser secondParser = new CompositionParser();
        headParser.setNextParser(secondParser);
        Parser tailParser = new AssociationParser();
        secondParser.setNextParser(tailParser);
    }

    /**
     * This method parses the user classes and updates the view panel with the data parsed.
     * @param panel
     */
    public void parseUML(CodeViewPanel panel) {
        for (UserClass userClass: DrawnClasses.getInstance().getClasses()) {
            headParser.parse(userClass, panel);
            panel.appendToPanel("\n\n", Color.black);
        }
    }
}
