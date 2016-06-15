package phwginfo.fundid.guis;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoButton implements ActionListener {

    public static void main(String[] args) {
        new DemoButton().init();
    }

    JButton button;
    JFrame frame;

    void init() {
        frame = new JFrame("DemoButton");
        button = new JButton("Hi there!");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setSize(200,100);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi there! The button has been pressed!");

    }
}
