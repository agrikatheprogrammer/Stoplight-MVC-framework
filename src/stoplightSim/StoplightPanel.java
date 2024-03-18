package stoplightSim;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;

import tools.*;


public class StoplightPanel extends AppPanel {
    private JButton change;
    public StoplightPanel(AppFactory factory) {
        super(factory);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        // Combine the existing line border with the empty border
        Border compoundBorder = BorderFactory.createCompoundBorder(
                blackline,
                emptyBorder
        );
        change = new JButton("Change");
        change.addActionListener(this);
        change.setBackground(Color.WHITE);
        change.setVisible(true);
        change.setBorder(compoundBorder);
        controlPanel.add(change);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        super.actionPerformed(ae);
        String cmmd=ae.getActionCommand();
        try {
            switch (cmmd) {
                case "Change":
                    appFactory.makeEditCommand(ca,cmmd,this).execute();
                    break;
            }
        } catch (Exception ex) {
            Utilities.error(ex); // all error handling done here!
        }
    }

    public static void main(String[] args) {
        AppFactory factory = new StoplightFactory();
        AppPanel panel = new StoplightPanel(factory);

    }

}
