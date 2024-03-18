//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package stoplightSim;

import tools.Publisher;
import java.awt.*;
import java.io.*;

public class Stoplight extends Model {

    private Color color = Color.GREEN;
    public Color getColor() { return color; }

    public void change() {
        if (color.equals(Color.GREEN)) color = Color.YELLOW;
        else if (color.equals(Color.YELLOW)) color = Color.RED;
        else if (color.equals(Color.RED)) color = Color.GREEN;
        notifySubscribers();
    }

}