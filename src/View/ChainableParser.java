package View;

import Model.UserClass;

/**
 * This abstract class is part of chain of responsibility pattern which contains the next successor to delegate the processing.
 * This is extended by the classes which are not at the end of parsing process.
 */
public abstract class ChainableParser implements Parser {
    Parser nextParser;
    public void setNextParser(Parser parser) {
        this.nextParser = parser;
    }

    public Parser getNextParser() { return nextParser; }
    public abstract void parse(UserClass userClass, CodeViewPanel panel);
}

