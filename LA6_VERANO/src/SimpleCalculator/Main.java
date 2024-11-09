package SimpleCalculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SC checkerPanel = new SC();

        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.add(checkerPanel.getSCPanel());
        frame.setVisible(true);
    }
}
