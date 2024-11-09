package FoodOrderingSystem;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        FOS checkerPanel = new FOS();

        JFrame frame = new JFrame("Food Ordering System ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.add(checkerPanel.getFOSPanel());
        frame.setVisible(true);
    }
}
