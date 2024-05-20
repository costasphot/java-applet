// MyApplet.java
// Simple Java Applet Implementation

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.BorderLayout; // Layout manager for arranging components
import javax.swing.JFrame; // Used to create a window frame
// import javax.swing.JPanel; - Not Used, General-purpose container for lightweight components

public class MyApplet extends Applet {
    // Standard eapplet lifecycle methods
    @Override
    public void init() {
        System.out.println("init() called");
    }

    @Override
    public void start() {
        System.out.println("start() called");
    }
    
    @Override
    public void stop() {
        System.out.println("stop() called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("paint() called");
        g.drawString("Hello!", 20, 20);
    }

    // Main method to run the applet as a standalone application
    public static void main(String[] args) {
        JFrame frame = new JFrame("Applet in a Frame"); // Creates a new window with a title
        MyApplet applet = new MyApplet(); // 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the application exits when the window is closed
        frame.setSize(400, 400); // Sets the size of the frame
        frame.setLayout(new BorderLayout()); // Sets the layout manager for the frame
        frame.add(applet, BorderLayout.CENTER); // Adds the applet to the frame

        applet.init();  // Initializes the applet
        applet.start(); // Starts the applet
        applet.setVisible(true); // Ensures the applet is visible within the 'JFrame'

        frame.setVisible(true); // Makes the window visible
    }
}
