package phwginfo.fundid.guis;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DemoProgressBar extends DemoButton {

    public static void main(String[] args) {
        new DemoProgressBar().init();
    }

    void init() {
        super.init();
        button.setText("Start progressbar");
    }

    JDialog dialog;

    @Override
    public void actionPerformed(ActionEvent e) {
        DoSomethingTask task = new DoSomethingTask();
        button.setEnabled(false);
        JProgressBar p  = new JProgressBar(task.progressInfo);
        dialog = new JDialog(frame);
        dialog.setSize(200,200);
        dialog.add(p);
        dialog.setVisible(true);
        task.start();

    }


    class DoSomethingTask extends Thread {

        BoundedRangeModel progressInfo = new DefaultBoundedRangeModel(0, 10, 0, 10);

        public void run() {
            for(int i=0; i<10;i++) {
                try {
                    Thread.sleep(1000);
                    progressInfo.setValue(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            dialog.setVisible(false);
            button.setEnabled(true);
        }

    }
}
