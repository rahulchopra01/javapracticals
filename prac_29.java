 

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

 

public class PracQues29 {

    private static void createAndShowGUI() {

        //Create and set up the window.

        JFrame frame = new JFrame("FrameDemo");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

        JLabel emptyLabel = new JLabel("");

        emptyLabel.setPreferredSize(new Dimension(600, 500));

        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

 

        //Display the window.

        frame.pack();

        frame.setVisible(true);

    }

 

    public static void main(String[] args) {

        //Schedule a job for the event-dispatching thread:

        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();

            }

        });

    }

}
