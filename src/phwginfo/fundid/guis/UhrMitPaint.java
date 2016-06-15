package phwginfo.fundid.guis;

import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

/**
 * Demo fo the simple usage of the paint method
 */
public class UhrMitPaint extends JPanel {

    public static void main(String[] args) throws Exception  {
        JFrame frame = new JFrame();
        UhrMitPaint uhr = new UhrMitPaint();
        frame.setContentPane(uhr);
        frame.setVisible(true);
        frame.setSize(300,200);
        while(true) {
            Thread.sleep(500);
            uhr.repaint();;
        }
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("Painting...");
        GregorianCalendar calendar = new GregorianCalendar();
        String chars = calendar.get(GregorianCalendar.HOUR_OF_DAY) + ":" +
                calendar.get(GregorianCalendar.MINUTE) + ":" +
                calendar.get(GregorianCalendar.SECOND);
        g.drawChars(chars.toCharArray(), 0, chars.length(), 100, 100);
        // System.out.println("Sleeping...");
        // try { Thread.sleep(10000); } catch(Exception ex) {}
        System.out.println("Finished...");
    }
}
