package View;

import javax.swing.*;
import java.awt.*;

/**
 * A panel that can update code view panel
 *
 * @author yagaa
 * @version 1.0.0
 */
public interface CodeViewPanel {
    void appendToPanel(String msg, Color c);
}
