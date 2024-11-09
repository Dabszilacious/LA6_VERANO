package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SC {

    private JTextField textField1;
    private JComboBox<String> comboBox1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton computeResultButton;
    private JLabel name1;
    private JLabel name2;
    private JLabel textResult;
    private JPanel SC;

    public SC() {
        comboBox1.addItem("Choose");
        comboBox1.addItem("+");
        comboBox1.addItem("-");
        comboBox1.addItem("*");
        comboBox1.addItem("/");
        computeResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(textField1.getText());
                    double num2 = Double.parseDouble(textField2.getText());
                    String operation = (String)  comboBox1.getSelectedItem();
                    double result;

                    // Perform the selected operation
                    switch (operation) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                textField3.setText("Error: Cannot divide by zero");
                                return;
                            }
                            break;
                        default:
                            textField3.setText("Error: Invalid operation");
                            return;
                    }

                    textField3.setText(" "+result);
                } catch (NumberFormatException ex) {
                    textField3.setText("Error: Please enter a valid number");
                }
            }
        });
    }

    public JPanel getSCPanel() {
        return SC;
    }
}