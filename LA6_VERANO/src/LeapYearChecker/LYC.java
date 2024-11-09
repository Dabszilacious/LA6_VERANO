package LeapYearChecker;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LYC {

    private JButton checkYearButton;
    private JPanel LYC;
    private JTextField textField1;

    public LYC() {
        LYC.setName("LYC");
        textField1.setName("YearTextField");
        checkYearButton.setName("CheckYearButton");

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(textField1.getText());
                    String message;
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        message = "Leap year";
                    } else {
                        message = "Not a leap year";
                    }
                    JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid year.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public JPanel getCheckerPanel() {
        return LYC;
    }
}