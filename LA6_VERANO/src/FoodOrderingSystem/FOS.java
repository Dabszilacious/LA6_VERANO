package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOS {
    private JCheckBox pizzaBox;
    private JCheckBox burgerBox;
    private JCheckBox friesBox;
    private JCheckBox softdrinksBox;
    private JCheckBox teaBox;
    private JCheckBox sundaeBox;
    private JButton orderButton;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JPanel FOS;

    public FOS() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        radioButton1.setSelected(true);
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalPrice = calculateTotalPrice();
                double discount = getDiscount();
                totalPrice = totalPrice - (totalPrice * discount);
                JOptionPane.showMessageDialog(FOS, "The total price is Php " + totalPrice);
            }
        });
    }

    private double calculateTotalPrice() {
        double price = 0;
        if (pizzaBox.isSelected()) {
            price += 100;
        }
        if (burgerBox.isSelected()) {
            price += 80;
        }
        if (friesBox.isSelected()) {
            price += 55;
        }
        if (softdrinksBox.isSelected()) {
            price += 55;
        }
        if (teaBox.isSelected()) {
            price += 50;
        }
        if (sundaeBox.isSelected()) {
            price += 40;
        }
        return price;
    }

    private double getDiscount() {
        if (radioButton2.isSelected()) {
            return 0.05;
        } else if (radioButton3.isSelected()) {
            return 0.10;
        } else if (radioButton4.isSelected()) {
            return 0.15;
        }
        return 0;
    }

    public JPanel getFOSPanel() {
        return FOS;
    }
}